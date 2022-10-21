/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import sql1.sqlconnect;
import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author zdai2
 */
public class PresentInscription {
    
    public PresentInscription(){

//        this.getAllCoureurs();
//        this.InscrireCoureurs();
    }
    public void getAllCoureurs(){
//        Coureur c1=new Coureur("nom1","prenom1",1999,1,2,"France","A","+");
//        Coureur c2=new Coureur("nom2","prenom1",1999,1,2,"France","A","+");
//        Coureur c3=new Coureur("nom3","prenom1",1999,1,2,"France","A","+");
//        Coureur c4=new Coureur("nom4","prenom1",1999,1,2,"France","A","+");
//        Coureur c5=new Coureur("nom5","prenom1",1999,1,2,"France","A","+");
//        Coureur c6=new Coureur("nom6","prenom1",1999,1,2,"France","A","+");
//        Coureur c7=new Coureur("nom7","prenom1",1999,1,2,"France","A","+");
//        Coureur c8=new Coureur("nom8","prenom1",1999,1,2,"France","A","+");
//        Coureur c9=new Coureur("nom9","prenom1",1999,1,2,"France","A","+");
//        Coureur c10=new Coureur("nom10","prenom1",1999,1,2,"France","A","+");

//        c1.uploadCoureur();
//        c2.uploadCoureur();
//        c3.uploadCoureur();
//        c4.uploadCoureur();
//        c5.uploadCoureur();
//        c6.uploadCoureur();
//        c7.uploadCoureur();
//        c8.uploadCoureur();
//        c9.uploadCoureur();
//        c10.uploadCoureur();
    }
    public int demanderedition(){
        PreparedStatement Preparesql;
	 sqlconnect con=new sqlconnect();//sqlconnect 
	
	Connection conn;  
    
        conn=(Connection) con.getConnection();
        
	try {
            String Value_sql="select CodeCourse,nomCourse from course" ;
            Preparesql=conn.prepareStatement(Value_sql);
			ResultSet res=Preparesql.executeQuery();
			
//			System.out.println(Value_sql);
                        
			while (res.next()) {	
				ArrayList<String>a = new ArrayList();

				a.add(res.getString("CodeCourse"));
				a.add(res.getString("nomCourse"));
				

			    System.out.println("SearchTable"+a.toString());   
			}
	} catch (Exception e) {
		e.printStackTrace();
	}
        
        Scanner scan=new Scanner(System.in);
        System.out.print("Choisir course : ");
        int numCourse = scan.nextInt();
        System.out.println("-> Edition de ce course : ");
        try {
            String Value_sql="select codeEdition,DateDebutEdition\n" +
"from Edition e,course c\n" +
"where e.CodeCourse=c.CodeCourse\n" +
"and e.CodeCourse='"+numCourse+"';" ;
            Preparesql=conn.prepareStatement(Value_sql);
			ResultSet res=Preparesql.executeQuery();
			
//			System.out.println(Value_sql);
                        
			while (res.next()) {	
				ArrayList<String>a = new ArrayList();

				a.add(res.getString("CodeEdition"));
				a.add(res.getString("DateDebutEdition"));
				

			    System.out.println("SearchTable"+a.toString());   
			}
	} catch (Exception e) {
		e.printStackTrace();
	}
        System.out.println("Choisir numero d'edition : ");
        int numEdition = scan.nextInt();
        return numEdition;
    }
    
    
    
    
    public void InscrireCoureurs(){
        PreparedStatement Preparesql;
	 sqlconnect con=new sqlconnect();//sqlconnect 
	
	Connection conn;  
    
        conn=(Connection) con.getConnection();
        
	
        int numEdition = this.demanderedition();
        System.out.println("Saisir votre numeroCoureur : ");
        Scanner scan=new Scanner(System.in);
        int numeroCoureur=scan.nextInt();
        System.out.println("!! Valider Inscription: (y/n)");
        String va=scan.next();
        if(va!="y"){
            try {
            Statement st;
            st = conn.createStatement();
            
            String Value_sql="insert into ParticiperC values('"+numeroCoureur+"','"+numEdition+"',null);";
//            INSERT INTO `ffc`.`participerc` (`numCoureur`, `codeEdition`) VALUES ('1', '1');
            System.out.println(Value_sql);
            st.executeUpdate(Value_sql);//执行预处理语句
            System.out.println("Reussir, entree pour continuer");

	} catch (Exception e) {
		e.printStackTrace();
	}
        }
        else{
            System.out.println("ok, bye!  Coureur"+numeroCoureur);
        }
    }
    
    public void CreerEquipe(){
        PreparedStatement Preparesql;
	 sqlconnect con=new sqlconnect();//sqlconnect 
	
	Connection conn;  
    
        conn=(Connection) con.getConnection();
        Scanner scan=new Scanner(System.in);
        System.out.println("Saisir votre nom d'equipe : ");
        
        String nomEquipe=scan.next();
        int codeEdition=this.demanderedition();
        System.out.println("Saisir votre nom : ");
        
        String nomCos=scan.next();
        System.out.println("Saisir votre nationalite : ");
        
        String nationaliteE=scan.next();
        System.out.println("Saisir votre email ");
        String mail=scan.next();
        InscriptionEquipe e1=new InscriptionEquipe(nomEquipe);
        
        
//        INSERT INTO `ffc`.`equipe`  VALUES ('11', '1', 'VD', 'VD', 'VD');
        try {
            Statement st;
            st = conn.createStatement();
            
            String Value_sql="insert into EQUIPE values('"+e1.getNumE()+"','"+codeEdition+"','"+nomEquipe+"','"+nomCos+"',null,null,null);";
//            INSERT INTO `ffc`.`participerc` (`numCoureur`, `codeEdition`) VALUES ('1', '1');
            System.out.println(Value_sql);
            st.executeUpdate(Value_sql);//执行预处理语句
            System.out.println("Reussir, entree pour continuer");

	} catch (Exception e) {
		e.printStackTrace();
	}
    }
    
    public void ajouterCoureur(){
        PreparedStatement Preparesql;
	 sqlconnect con=new sqlconnect();//sqlconnect 
	
	Connection conn;  
    
        conn=(Connection) con.getConnection();
        Scanner scan=new Scanner(System.in);
        
        System.out.println("Saisir votre numero d'equipe : ");
        
        int numEquipe=scan.nextInt();
        
        System.out.println("Saisir numero de coureur : ");
        
        int numCoureur=scan.nextInt();
        try {
            Statement st;
            st = conn.createStatement();
            
            String Value_sql="insert into composer values('"+numEquipe+"','"+numCoureur+"');";
//            INSERT INTO `ffc`.`composer` VALUES ('1', '1');
            System.out.println(Value_sql);
            st.executeUpdate(Value_sql);//执行预处理语句
            System.out.println("Reussir, entree pour continuer");

	} catch (Exception e) {
		e.printStackTrace();
	}
 
        
    }
    
    public void accepterRefuser(){
        PreparedStatement Preparesql;
	 sqlconnect con=new sqlconnect();//sqlconnect 
	
	Connection conn;  
    
        conn=(Connection) con.getConnection();
        String num="0";
        Scanner scan=new Scanner(System.in);
        
        System.out.println("Saisir votre numero Coureur : ");
        
        int numCoureur=scan.nextInt();
        

        try {
            String Value_sql="SELECT e.numEquipe \n" +
"FROM composer c,equipe e\n" +
"where c.numCoureur='1'\n" +
"and c.numEquipe=e.numEquipeand e.codeEdition='1';";
            Preparesql=conn.prepareStatement(Value_sql);
			ResultSet res=Preparesql.executeQuery();
			
//			System.out.println(Value_sql);
                        
			if (res.next()) {	
//				ArrayList<String>a = new ArrayList();

				num =res.getString("e.codeEdition");
//				a.add(res.getString("DateDebutEdition"));
				

			    System.out.println("SearchTable"+num);   
			}
                        else{
                            System.out.println("pas de invitation equipe");
                        }
	} catch (Exception e) {
		e.printStackTrace();
	}
        
        System.out.println("!! Valider Equipe: (y/n)");
        String va=scan.next();
        if(va=="y"){
//            DELETE FROM `ffc`.`composer` WHERE (`numEquipe` = '1') and (`numCoureur` = '1');
            try {
            Statement st;
            st = conn.createStatement();
            
            String Value_sql="DELETE FROM `ffc`.`composer` WHERE (`numEquipe` = '"+num+"') and (`numCoureur` = '"+numCoureur+"');";
//            INSERT INTO `ffc`.`composer` VALUES ('1', '1');
            System.out.println(Value_sql);
            st.executeUpdate(Value_sql);//执行预处理语句
            System.out.println("Reussir, entree pour continuer");

	} catch (Exception e) {
		e.printStackTrace();
	}
        }
        else{
            System.out.println("Reussir, vous etes dans une equipe");
        }
        
        
    
        
    }
    public Edition instInscriptionCoureur(){
        PreparedStatement Preparesql;
	 sqlconnect con=new sqlconnect();//sqlconnect 
	
	Connection conn;  
    
        conn=(Connection) con.getConnection();
        
        
        int numEdition = this.demanderedition();
        
        String re="select numCoureur, idEtape, tempsCE from classercoureuretape where codeEdition='"+numEdition+"';";
        String renumCoureur="select DISTINCT numCoureur from classercoureuretape where codeEdition='"+numEdition+"';";
        ArrayList<String> numcoureurs=new ArrayList();
        ArrayList<Coureur> coureurs=new ArrayList();
        ArrayList<InscriptionCoureur> InscriptionCoureurs=new ArrayList();
        String reidEtape="select DISTINCT idEtape from classercoureuretape where codeEdition='"+numEdition+"';";
        ArrayList<String> idEtapes=new ArrayList();
        ArrayList<Etape> etapes=new ArrayList();
        Course course1=new Course("Tour de France", "villeDepartC", "villeArriveeC", "paysDepartC", "paysArriveeC", "typeCourse");
        Course course2=new Course("Open de Cernay", "villeDepartC", "villeArriveeC", "paysDepartC", "paysArriveeC", "typeCourse");
        
        try {
            
            Preparesql=conn.prepareStatement(renumCoureur);
			ResultSet res=Preparesql.executeQuery();
			
//			System.out.println(Value_sql);
                        
			while (res.next()) {	
				numcoureurs.add(res.getString("numCoureur"));
//				a.add(res.getString("DateDebutEdition"));
				

//			    System.out.println("SearchTable"+num);   
			}
	} catch (Exception e) {
		e.printStackTrace();
	}
        
        try {
            
            Preparesql=conn.prepareStatement(reidEtape);
			ResultSet res=Preparesql.executeQuery();
			
//			System.out.println(Value_sql);
                        
			while (res.next()) {	
				idEtapes.add(res.getString("idEtape"));
  
			}
	} catch (Exception e) {
		e.printStackTrace();
	}
//instancier tout les etapes d'une edition     
        for(String i:idEtapes){
            
            try {
            
            Preparesql=conn.prepareStatement("select * from Etape where idEtape='"+i+"';");
			ResultSet res=Preparesql.executeQuery();
			

                        
			if (res.next()) {
//                            idEtape, ordreEtape, CodeCourse, villeDepartEtape, villeArriveeEtape, distance
				int id=res.getInt("idEtape");
//                                int or=res.getInt("ordreEtape");
                                String vd=res.getString("villeDepartEtape");
                                String va=res.getString("villeArriveeEtape");
                                float dis=res.getFloat("distance");
                                Etape e=new Etape(vd,va,dis,id);
                                etapes.add(e);
                                course1.ajouterEtape(e);
			}
	} catch (Exception e) {
		e.printStackTrace();
	}
            
            
        }
        
//instancier tout les coureurs d'une edition       
        for(String i:numcoureurs){
            
            try {
            Preparesql=conn.prepareStatement("select * from Coureur where numCoureur='"+i+"';");
			ResultSet res=Preparesql.executeQuery();
			

                        
			if (res.next()) {
//            numCoureur, nomCOureur, prenomCoureur, dateNaissance, groupeSanguin, rhesus, nationaliteC
//String nomCoureur,String prenomCoureur
                            String nom=res.getString("nomCOureur");
                            String prenom=res.getString("prenomCoureur");
                            Coureur co=new Coureur(nom,prenom);
                            coureurs.add(co);
                            InscriptionCoureur ic1=new InscriptionCoureur();
                            InscriptionCoureurs.add(ic1);
                            ic1.setC(co);
			}
	} catch (Exception e) {
		e.printStackTrace();
	}
            
            
        }
        
        try {
            
            Preparesql=conn.prepareStatement(re);
			ResultSet res=Preparesql.executeQuery();
			
//Enregistrer le temps d'un coureur d'une etape
                        
			while (res.next()) {	
				int ide=res.getInt("idEtape");
                                int numc=res.getInt("numCoureur");
                                float te=res.getFloat("tempsCE");
                                for(InscriptionCoureur ic:InscriptionCoureurs){
                                    if(ic.getC().getNumCoureur()==numc){
                                        for(Etape et:etapes){
                                            if(et.getIdEtape()==ide){
                                                ic.enregistrerTemps(et, te);
                                            }
                                        }
                                    }
                                }
			}
	} catch (Exception e) {
		e.printStackTrace();
	}
        Edition ed1=null;
//        Instancier Edition
        try {
            Preparesql=conn.prepareStatement("select datedebutEdition,datefinEdition from edition where codeEdition='"+numEdition+"';");
			ResultSet res=Preparesql.executeQuery();
			

                        
			if (res.next()) {
//            numCoureur, nomCOureur, prenomCoureur, dateNaissance, groupeSanguin, rhesus, nationaliteC
//String nomCoureur,String prenomCoureur
                            String debut=res.getString("datedebutEdition");
                            String fin=res.getString("datefinEdition");
                            ed1=new Edition(debut,fin);
                            
			}
	} catch (Exception e) {
		e.printStackTrace();
	}
//        Edition ed1=new Edition();
        ed1.setCourse(course1);
        for(InscriptionCoureur ic:InscriptionCoureurs){
            ed1.inscrireCoureur(ic);
        }
//        return ed1;
        
        //commencer instancier equipe
//        liste de numEquipe
        String reidEquipe="select numEquipe from equipe where codeEdition='"+numEdition+"';";
        ArrayList<String> numequipes=new ArrayList();
        try {
            
            Preparesql=conn.prepareStatement(reidEquipe);
			ResultSet res=Preparesql.executeQuery();
			
//			System.out.println(Value_sql);
                        
			while (res.next()) {	
				numequipes.add(res.getString("numEquipe"));
  
			}
	} catch (Exception e) {
		e.printStackTrace();
	}
        
//        instancier les equipes
//        ArrayList<InscriptionEquipe> equipes=new ArrayList();
        
        for(String nuE:numequipes){
                            
            try {
            String reEquipe="select nomEquipe from equipe where numEquipe='"+nuE+"';";
            Preparesql=conn.prepareStatement(reEquipe);
			ResultSet res=Preparesql.executeQuery();

			if (res.next()) {	
                            InscriptionEquipe e=new InscriptionEquipe(res.getString("nomEquipe"));
                            ed1.inscrireEquipe(e);
//                            equipes.add(e);
                            String rescompo="select numCoureur from composer where numEquipe='"+nuE+"';";
                            try {
                                    Preparesql=conn.prepareStatement(rescompo);
                                                ResultSet res1=Preparesql.executeQuery();

                                                while (res1.next()) {	
                                                    int intC=res1.getInt("numCoureur");
                                                    for(InscriptionCoureur ic:InscriptionCoureurs){
                                                        int numccc=ic.getNumInsCoureur();
                                                        if(numccc==intC){
                                                            e.inviterCoureur(ic);
                                                        }
                                                    }

                                                }
                                } catch (Exception e1) {
                                        e1.printStackTrace();
                                }
                            

			}
	} catch (Exception e) {
		e.printStackTrace();
	}
        }
//        ed1.enregistrerClassementEtapeE(etapeTest);

        
        
        return ed1;
    }
    public void classementE(){
        Edition ed1=this.instInscriptionCoureur();
        ArrayList<Etape> es=ed1.getCourse().getListeEtapes();
        Etape etapeTest=es.get(0);
        ed1.enregistrerClassementEtapeE(etapeTest);
//        ed1.enregistrerClassementEtapeE(etapeTest);
        for(InscriptionCoureur ic:ed1.obtenirlisteCoureurs()){
            System.out.println("NumCoureur"+ic.getNumInsCoureur()+" "+ic.getC().getPrenomCoureur()+" "+ic.getC().getNomCoureur()+" classement etape COUREUR "+ic.getClassementEta().get(etapeTest).getClassementC());
        }
        for(InscriptionEquipe ie:ed1.obtenirListeEquipes()){
            System.out.println(ie.getNomEquipe()+" Temps "+ie.getClassementE().get(etapeTest).getTempsE()+" classement EE "+ie.getClassementE().get(etapeTest).getClassementE());
            
        } 
    }
    
    public void classementEdition(){
        Edition ed1=this.instInscriptionCoureur();
//        ArrayList<Etape> es=ed1.getCourse().getListeEtapes();
        ed1.enregistrerClassementGC();
        ed1.enregistrerClassementGE();
        for(InscriptionCoureur ic:ed1.obtenirlisteCoureurs()){
            System.out.println(ic.getNumInsCoureur()+" Temps "+ic.getTempstoC()+" classement GC "+ic.getClassementEdition());
            
        }
        for(InscriptionEquipe ie:ed1.obtenirListeEquipes()){
            System.out.println(ie.getNomEquipe()+" Temps "+ie.getTempsTE()+" classement GE "+ie.getClassementEdition());
            
        }
    }
    
    
    
    public void classementEE(){
    
        Edition ed1=this.instInscriptionCoureur();
        ArrayList<Etape> es=ed1.getCourse().getListeEtapes();
        Etape etapeTest=es.get(0);
        ed1.enregistrerClassementEtapeE(etapeTest);
        for(InscriptionEquipe ie:ed1.obtenirListeEquipes()){
            System.out.println(ie.getNomEquipe()+" Temps "+ie.getClassementE().get(etapeTest).getTempsE()+" classement EE "+ie.getClassementE().get(etapeTest).getClassementE());
            
        } 
    }
    
    public void classementEditionE(){
        Edition ed1=this.instInscriptionCoureur();
        ArrayList<Etape> es=ed1.getCourse().getListeEtapes();
        for(Etape ee:es){
            ed1.enregistrerClassementEtapeE(ee);
        }

        for(InscriptionEquipe ie:ed1.obtenirListeEquipes()){
            System.out.println(ie.getNomEquipe()+" Temps "+ie.getTempsTE()+" classement GE "+ie.getClassementEdition());
            
        }
    }
    
}

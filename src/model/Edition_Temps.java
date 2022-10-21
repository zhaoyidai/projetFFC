/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.*;
import sql.sqlconnect;
/**
 *
 * @author utiae
 */
public class Edition_Temps {
    
    public void edition(){
        //Récupération des données
        ArrayList<Course> courses = new ArrayList<Course>();
        ArrayList<Integer> codesCourse = new ArrayList<Integer>();
        
        ArrayList<Integer> codesEdition = new ArrayList<Integer>();
        PreparedStatement Preparesql;
	sqlconnect con=new sqlconnect();
        Connection conn=(Connection) con.getConnection();
        try {
            //Courses
            String Value_sql="select * from course";
            Preparesql=conn.prepareStatement(Value_sql);
            ResultSet res=Preparesql.executeQuery();
            int i=0;
            while (res.next()) {
               
                String nomCourse =res.getString("nomCourse");
                String villeDepartC = res.getString("villeDepartC");
                String villeArriveeC = res.getString("villeArriveeC");
                String paysDepartC = res.getString("paysDepartC");
                String paysArriveeC = res.getString("paysArriveeC");
                String typeCourse = res.getString("typeCourse");
                courses.add(new Course(nomCourse, villeDepartC, villeArriveeC, paysDepartC, paysArriveeC, typeCourse));
                codesCourse.add(res.getInt("CodeCourse"));
                // On ajoutes les editions de chaque course
                //Etapes
                String queryEdition= "select * from edition where codeCourse="+res.getInt("CodeCourse");
                Preparesql=conn.prepareStatement(queryEdition);
                ResultSet rsl = Preparesql.executeQuery();
                while (rsl.next()){
                    String dateDebut = rsl.getString("dateDebutEdition");
                    String dateFin = rsl.getString("dateFinEdition");
                    int codeCourse = rsl.getInt("codeCourse");
                    //On créer une nouvelle editon pour l'objet course
                    courses.get(i).ajouterEdition(new Edition(dateDebut,dateFin,courses.get(i)));
                    codesEdition.add(rsl.getInt("codeEdition"));
                }
                // On ajoutes les etapes de chaque course
                //Etapes
                String queryEtape= "select * from etape where CodeCourse="+res.getInt("CodeCourse");
                Preparesql=conn.prepareStatement(queryEtape);
                ResultSet rs = Preparesql.executeQuery();
                while (rs.next()){
                    String villeDepartEtape = rs.getString("villeDepartEtape");
                    String villeArriveeEtape = rs.getString("villeArriveeEtape");
                    float distance = rs.getFloat("distance");
                    int idEtape = rs.getInt("idEtape");
                    courses.get(i).ajouterEtape(new Etape(villeDepartEtape,villeArriveeEtape,distance,idEtape));
                 
                }
                
                //Incrémenter notre position dans l'arraylist de courses
                i=i+1;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Accueil");
        System.out.println("1 : Créer edition ");
        System.out.println("2 : Enregistrer temps ");
        System.out.print("Choix :");
        int choixMenu = sc.nextInt();
        switch(choixMenu){
            case(1):
                System.out.println("Les courses de la Federation Francaise de Cyclisme");
                for (int i=0; i<courses.size();i++){
                System.out.println(i+1 +" : "+courses.get(i).getNomCourse());
                }
                /*
                * 			Choix de la course
                * 
                */
                System.out.println("Choisir course :");

                int choixCourse = sc.nextInt() ;
                System.out.println("Vous avez choisi :");
                System.out.println("Nom course : "+ courses.get(choixCourse-1).getNomCourse()+" \n"
                        + "Ville de depart : " + courses.get(choixCourse-1).getVilleDepartC()+" \n"
                        + "Ville d'arrivee : "+ courses.get(choixCourse-1).getVilleArriveeC()+" \n"
                        + "Pays de départ : "+ courses.get(choixCourse-1).getPaysDepartC()+" \n"
                        + "Pays d'arrivee : "+ courses.get(choixCourse-1).getPaysArriveeC()+" \n"
                        );

                System.out.println("Les etapes de la course :");        
                for (Etape etape:courses.get(choixCourse-1).getListeEtapes()){
                    etape.afficherTout();
                }
                /*
                * 			Saisie de l'edition
                * 
                */
                System.out.println("Saisie des informations de l'edition :");
                System.out.print("Date début :");
                String dateDebut = sc.next();

                System.out.println("Date fin :");
                String dateFin = sc.next();

                //Ajout de l'edition dans la base de donnees
                //Requête d'insertion
                String queryNewEdition = "insert into edition(codeCourse,dateDebutEdition,dateFinEdition) values('"+codesCourse.get(choixCourse-1) +"','"+dateDebut +"','"+ dateFin +"')";
                System.out.println(queryNewEdition);
                try {
                    PreparedStatement stmt = conn.prepareStatement(queryNewEdition);
                    int i = stmt.executeUpdate(queryNewEdition);
                    //Message de confirmation
                    System.out.println(i+"ligne inseree avec succes");
                } catch (SQLException ex) {
                    Logger.getLogger(Edition_Temps.class.getName()).log(Level.SEVERE, null, ex);
                }
            case(2):
                /*
                * 			Enregistrer les temps
                * 
                */
                System.out.println("* \n"
                        + "*        Enregistrement des temps \n"
                        + "*\n");
                System.out.println("Les courses de la Federation Francaise de Cyclisme");
                for (int i=0; i<courses.size();i++){
                    System.out.println(i+1 +" : "+courses.get(i).getNomCourse());
                }
                /*
                * 			Choix de la course
                * 
                */

                System.out.println("Choisir course :");
                int choixCourseET = sc.nextInt() ;
                System.out.println("Vous avez choisi :"+ courses.get(choixCourseET-1).getNomCourse());
                //Editions de la course
                for (int i=0;i<courses.get(choixCourseET-1).getListeEditions().size();i++){
                    courses.get(choixCourseET-1).getListeEditions().get(i).afficherEdition();
                }      
                System.out.println("Choisir edition :");
                int choixEditionET = sc.nextInt() ;
                //Saisie de l'etape en cours d'enregistrement
                System.out.print("Etape : ");
                int choixEtape = sc.nextInt();
                ArrayList<Etape> etapes= courses.get(choixCourseET-1).getListeEtapes();
                while(choixEtape-1>=etapes.size()){
                    System.out.print("Etape : ");
                    choixEtape = sc.nextInt();
                }
                //Informations de l'étape de l'édition
                etapes.get(choixEtape-1).afficherTout();
                
                //On récupère tous les coureurs de la course qui sont en course
                //Requete de récupération
                String queryCoureurs = "select * from participerc where codeEdition="+codesEdition.get(choixEditionET-1)+"";
                System.out.println(queryCoureurs);
                System.out.println(codesEdition.get(choixEditionET));
                try {
                    Preparesql=conn.prepareStatement(queryCoureurs);
                    ResultSet res=Preparesql.executeQuery();
                    while (res.next()) {
                        String numCoureur =res.getString("numCoureur");
                        int codeEdition = res.getInt("codeEdition");
                        //On saisie leurs temps
                        System.out.print("Coureur : "+ numCoureur +" Temps : ");
                        float temps = sc.nextFloat();  
                        //classercoureuretape
                        //On enregsitre dans la bd
                        //Requete d'insertion
                        String queryNewTemps = "insert into classercoureuretape(numCoureur,codeEdition,idEtape,tempsCE) values('"+numCoureur +"','"+codeEdition +"','"+ courses.get(choixCourseET-1).getListeEtapes().get(choixEtape).getIdEtape() +"','"+ temps +"')";
                        System.out.println(queryNewTemps);
                        try {
                            PreparedStatement stmt = conn.prepareStatement(queryNewTemps);
                            int i = stmt.executeUpdate(queryNewTemps);
                            //Message de confirmation
                            System.out.println(i+"ligne inseree avec succes");
                        } catch (SQLException ex) {
                            Logger.getLogger(Edition_Temps.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(Edition_Temps.class.getName()).log(Level.SEVERE, null, ex);
                }
                //Fini
        }  
    }
}

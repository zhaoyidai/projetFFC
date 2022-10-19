/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Hashtable;
import java.util.Random;
import javax.lang.model.SourceVersion;

/**
 *
 * @author utiae
 */
public class Edition {
    //Attributs
    protected String dateDebutEdition;
    protected String dateFinEdition;
    protected Coureur meilleurSprinteur;
    protected ArrayList<Coureur> meilleurSprinteurs;
    protected ArrayList<Coureur> meilleurGrimpeurs;
    protected Coureur meilleurGrimpeur;
    protected Coureur meilleurJeune;
    protected Course course;
    protected ArrayList<InscriptionEquipe> equipes;
    protected ArrayList<InscriptionCoureur> coureurs;
    
    //Constructeur
    public Edition(String dateDebutEdition, String dateFinEdition,Course course){
        this.dateDebutEdition=dateDebutEdition;
        this.dateFinEdition=dateFinEdition;
        this.course=course;
        this.coureurs= new ArrayList<InscriptionCoureur>();
        this.equipes= new ArrayList<InscriptionEquipe>();
        this.meilleurGrimpeurs = new ArrayList<Coureur>();
        this.meilleurSprinteurs = new ArrayList<Coureur>();
        this.course.editions.add(this);
    }
    
    public String getDateDebutEdition(){
        return this.dateDebutEdition;
    }
    
    public String getDateFinEdition(){
        return this.dateFinEdition;
    }
 
    
    //Les méthodes de la classe Edition
    //Retourne l'édition de course
    public Edition getEdition(){
        return this;
    }
    
    //Affiche les informations d'une édition
    public void afficherEdition(){
        System.out.println("Edition de la course "+ this.course.getNomCourse());
        System.out.println("Date début édition " + this.getDateDebutEdition());
        System.out.println("Date fin édition " + this.getDateFinEdition());
        this.course.afficherEtapes();
    }
    
    //Inscrit une équipe à l'édition de course
    public void inscrireEquipe(InscriptionEquipe equipe){
        this.equipes.add(equipe);
    }
    
    //Inscrit un coureur à l'édition de course
    public void inscrireCoureur(InscriptionCoureur coureur){
        this.coureurs.add(coureur);
    }
    
    //Retourne la liste des coureurs de l'édition de course
    public ArrayList<InscriptionCoureur> obtenirlisteCoureurs(){
        
        return this.coureurs;
        
    }
    
    //Supprime l'inscription d'une équipe à l'édition de course
    public void supprimerEquipe(InscriptionEquipe equipe){
        
        this.equipes.remove(equipe);
    }
    
    //Retourne le classement général provisoire des coureurs à l'édition de la course
    public int[] getClassementGC(){
        
        return null;
        
    }
    
    //Retourne le classement général provisoire des équipes à l'édition de la course
    public int[] getClassementGE(){
        
        return null;
        
    }
    
    //Modifie les informations d'une édition de course
    public void modifEdition(String dateDebut, String dateFin){
        this.dateDebutEdition=dateDebut;
        this.dateFinEdition=dateFin;
    }
    
    //Retourne la liste des équipes qui participent à l'édition de course
    public ArrayList<InscriptionEquipe> obtenirListeEquipes(){
           
        return this.equipes;
           
    }
    //Enregistrer le temps pour chaque etape
    public void enregistrerTemps(Etape e,float temps,InscriptionCoureur ic){
        ic.enregistrerTemps(e,temps);
    }
    //Enregistrer le classement d'une etape
    public void enregistrerClassementEtape(Etape e){
        if(this.coureurs.get(0).getClassementEta().get(e)!=null){
            ArrayList<ClassementCoureur> etapeclassement=new ArrayList();
            for(InscriptionCoureur ic:coureurs){
                etapeclassement.add(ic.getClassementEta().get(e));
            }
            etapeclassement.sort(new EtapeComparator());
            for(int i=0;i<etapeclassement.size();i++){
                etapeclassement.get(i).setClassementC(i+1);
            }
            
            ArrayList<ClassementEquipe> etapeclassementE=new ArrayList();
            for(InscriptionEquipe ie:equipes){
                ie.calculerTempsEEtape(e);
                etapeclassementE.add(ie.getClassementE().get(e));
            }
            etapeclassementE.sort(new EtapeComparatorEquipe());
            for(int i=0;i<etapeclassementE.size();i++){
                etapeclassementE.get(i).setClassementE(i+1);
            }
            
            
        }else
        {
            System.out.println("pas encore enregistrer le temps pour cette étape !");
        }
    }
    //Enregistrer le classement générale des coureurs
    public void enregistrerClassementGC(){
        ArrayList<Etape> listeEtapes=this.course.getListeEtapes();
        ArrayList<InscriptionCoureur> classFCoureurs=new ArrayList();
//        sort liste des coureurs
        for(InscriptionCoureur ic:coureurs){
//            ClassementGC classementc=new ClassementGC();
            float tempst=0;
            for(Etape e:listeEtapes){
               tempst+=ic.getClassementEta().get(e).getTemps();
               
            } 
            ic.setTempstoC(tempst);
            classFCoureurs.add(ic);
        }
        classFCoureurs.sort(new EditionComparator());
        for(int i=0;i<classFCoureurs.size();i++){
            classFCoureurs.get(i).setClassementEdition(i+1);
        }
    }
    
    //Enregistrer le classement générale des équipes
    public void enregistrerClassementGE(){
        
        
    }
    
    //Termine l'édition
    public void terminerEdition(){
        
    }
    
     public void setMeilleurSprinteur(){
        Coureur meilleur;
        int pointTop = 0;
        for(int i=0; i<this.coureurs.size(); i++){
            
            this.coureurs.get(i).calculerPointsSprintCoureur();
            int point = this.coureurs.get(i).getPointsSprint();
            
            if (point>pointTop){
                this.meilleurSprinteurs.add(this.coureurs.get(i).getC());
            }else if(point==pointTop){
                this.meilleurSprinteurs.add(this.coureurs.get(i).getC());
            }
            
        }
        
        if(this.meilleurSprinteurs.size()==1){
            this.meilleurSprinteur = this.meilleurSprinteurs.get(0);
        }else if (this.meilleurSprinteurs.size()>1){
            Random rand = new Random();
            int nombreA = rand.nextInt(this.meilleurSprinteurs.size())+1;
            this.meilleurSprinteur = this.meilleurSprinteurs.get(nombreA);
        }
    }
    
    public Coureur getMeilleurSprinteur(){
        return this.meilleurSprinteur;
    }
    
    public void setMeilleurGrimpeur(){
        Coureur meilleur;
        int pointTop = 0;
        for(int i=0; i<this.coureurs.size(); i++){
            this.coureurs.get(i).calculerPointsColCoureur();
            int point = this.coureurs.get(i).getPointsCol();
            
            if (point>pointTop){
                this.meilleurGrimpeurs.add(this.coureurs.get(i).getC());
            }else if(point==pointTop){
                this.meilleurGrimpeurs.add(this.coureurs.get(i).getC());
            }
            
        }
        
        if(this.meilleurGrimpeurs.size()==1){
            this.meilleurGrimpeur = this.meilleurGrimpeurs.get(0);
        }else if (this.meilleurGrimpeurs.size()>1){
            Random rand = new Random();
            int nombreA = rand.nextInt(this.meilleurGrimpeurs.size());
            this.meilleurGrimpeur = this.meilleurGrimpeurs.get(nombreA);
        }
    }
    
    public Coureur getMeilleurGrimpeur(){
        return this.meilleurGrimpeur;
    }
    
}


class EditionComparator implements Comparator<InscriptionCoureur>{
 
    @Override
    public int compare(InscriptionCoureur o1, InscriptionCoureur o2) {
        // TODO Auto-generated method stub
        
        if(o1.getTempstoC()>o2.getTempstoC())
            return 1;
        else if(o1.getTempstoC()<o2.getTempstoC())
            return -1;
        else{
            return 0;
        }
    }
}

class EtapeComparator implements Comparator<ClassementCoureur>{
 
    @Override
    public int compare(ClassementCoureur o1, ClassementCoureur o2) {
        // TODO Auto-generated method stub
        
        if(o1.getTemps()>o2.getTemps())
            return 1;
        else if(o1.getTemps()<o2.getTemps())
            return -1;
        else{
            
                return 0;
        }
    } 
    
}

class EtapeComparatorEquipe implements Comparator<ClassementEquipe>{
 
    @Override
    public int compare(ClassementEquipe o1, ClassementEquipe o2) {
        // TODO Auto-generated method stub
        
        if(o1.getTempsE()>o2.getTempsE())
            return 1;
        else if(o1.getTempsE()<o2.getTempsE())
            return -1;
        else{
            
                return 0;
        }
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author utiae
 */
public class Edition {
    //Attributs
    protected String dateDebutEdition;
    protected String dateFinEdition;
    protected Coureur meilleurSprinteur;
    protected Coureur meilleurGrimpeur;
    protected Coureur meilleurJeune;
    protected Course course;
    
    //Constructeur
    public Edition(String dateDebutEdition, String dateFinEdition,Course course){
        this.dateDebutEdition=dateDebutEdition;
        this.dateFinEdition=dateFinEdition;
        this.course=course;
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
        this.course.afficherEtapes();;
    }
    
    //Inscrit une équipe à l'édition de course
    public void inscrireEquipe(){
        
    }
    
    //Inscrit un coureur à l'édition de course
    public void inscrireCoureur(){
        
    }
    
    //Retourne la liste des coureurs de l'édition de course
    public InscriptionCoureur[] obtenirlisteCoureurs(){
        
        return null;
        
    }
    
    //Supprime l'inscription d'une équipe à l'édition de course
    public void supprimerEquipe(){
        
        
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
    public void modifEdition(){
        
    }
    
    //Retourne la liste des équipes qui participent à l'édition de course
    public InscriptionEquipe[] obtenirListeEquipes(){
           
        return null;
           
    }
    
    //Enregistrer le classement générale des coureurs
    public void enregistrerClassementGC(){
        
        
    }
    
    //Enregistrer le classement générale des équipes
    public void enregistrerClassementGE(){
        
        
    }
    
    //Termine l'édition
    public void terminerEdition(){
        
    }
    
    
}

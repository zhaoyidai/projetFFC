/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author mc
 */
public class Course {
    //Attributs
    protected String nomCourse;
    protected String villeDepartC;
    protected String villeArriveeC;
    protected String paysDepartC;
    protected String paysArriveeC;
    protected String typeCourse;
    protected ArrayList<Edition> editions;
    protected ArrayList<Etape> etapes;
    
    //Constructeur
    public Course(String nomCourse, String villeDepartC, String villeArriveeC, String paysDepartC, String paysArriveeC, String typeCourse){
        
        this.nomCourse=nomCourse;
        this.paysDepartC=paysDepartC;
        this.paysArriveeC=paysArriveeC;
        this.villeDepartC=villeDepartC;
        this.villeArriveeC=villeArriveeC;
        this.typeCourse=typeCourse;
        this.editions= new ArrayList<Edition>();
        this.etapes= new ArrayList<Etape>();
    }

    public String getVilleDepartC() {
        return villeDepartC;
    }

    public String getVilleArriveeC() {
        return villeArriveeC;
    }

    public String getPaysDepartC() {
        return paysDepartC;
    }

    public String getPaysArriveeC() {
        return paysArriveeC;
    }

    public String getTypeCourse() {
        return typeCourse;
    }
    
    //Les méthodes de la classe Course
    
    public String getNomCourse(){
        return this.nomCourse;
    }
    //Retourne les editions de la course
    public ArrayList<Edition> getListeEditions(){
        return this.editions;
    }
    
    //Retourne les etapes de la course
    public ArrayList<Etape> getListeEtapes(){
        return this.etapes;
    }
    
    //Affiche les étapes de la course
    public void afficherEtapes(){
        System.out.println("Etapes de la course "+ this.nomCourse);
        for (int i=0;i<this.etapes.size();i++){
            this.etapes.get(i).afficherTout();
        }
    }
    
    //Ajoute une étape à la course
    public void ajouterEtape(Etape etape){
        this.etapes.add(etape);
    }
    
    public void ajouterEdition(Edition edition){
        this.editions.add(edition);
    }
    
}

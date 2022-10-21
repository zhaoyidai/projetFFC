/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

/**
 *
 * @author utiae
 */
public class Etape {
    //Attributs
//    public static int ID_GENEtape=0;
    protected int idEtape;
//    protected int numInsCoureur;
    protected String villeDepartEtape;
    protected String villeArriveeEtape;
    protected float distance;
    protected Sprint[] sprints;
    protected Col[] cols;
    
    //Constructeur
    public Etape(String villeDepartEtape, String villeArriveeEtape, float distance,int idEtape){
        this.idEtape=idEtape;
//        ID_GENEtape++;
        this.villeDepartEtape=villeDepartEtape;
        this.villeArriveeEtape=villeArriveeEtape;
        this.distance=distance;
        this.sprints=new Sprint[5];
        this.cols=new Col[5];
    }
    //Les méthodes de la classe Etape
    
    public void afficherTout(){
        System.out.println("Ville depart : "+this.villeDepartEtape + " | Ville arrivee : "+ this.villeArriveeEtape +" | Distance : "+ this.distance +"km" );
    }
    
    //retourne tous les sprints de l'étape
    public Sprint[] obtenirListeSprints(){
        return this.sprints;
    }

    public int getIdEtape() {
        return idEtape;
    }
    
    //Retourne tous les cols de l'étape
    public Col[] obtenirListeCols(){
        return this.cols;
    }
    
    //Ajoute un sprint à l'étape
    public void ajouterSprint(Sprint sprint){
        for (int i=0;i<this.sprints.length;i++){
            if(this.sprints[i]!=null){
                
                this.sprints[i]=sprint;
            }
            this.sprints[i]=sprint;
        }
        
    }
    
    public void ajouterCol(Col col){
        for (int i=0;i<this.cols.length;i++){
            if(this.cols[i]!=null){
                
                this.cols[i]=col;
            }
            this.cols[i]=col;
        }
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + this.idEtape;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Etape other = (Etape) obj;
        if (this.idEtape != other.idEtape) {
            return false;
        }
        if (Float.floatToIntBits(this.distance) != Float.floatToIntBits(other.distance)) {
            return false;
        }
        if (!Objects.equals(this.villeDepartEtape, other.villeDepartEtape)) {
            return false;
        }
        if (!Objects.equals(this.villeArriveeEtape, other.villeArriveeEtape)) {
            return false;
        }
        if (!Arrays.deepEquals(this.sprints, other.sprints)) {
            return false;
        }
        return Arrays.deepEquals(this.cols, other.cols);
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author utiae
 */
public class Etape {
    //Attributs
    protected String villeDepartEtape;
    protected String villeArriveeEtape;
    protected float distance;
    protected Sprint[] sprints;
    protected Col[] cols;
    
    //Constructeur
    public Etape(String villeDepartEtape, String villeArriveeEtape, float distance){
        this.villeDepartEtape=villeDepartEtape;
        this.villeArriveeEtape=villeArriveeEtape;
        this.distance=distance;
        this.sprints=new Sprint[5];
        this.cols=new Col[5];
    }
    //Les méthodes de la classe Etape
    
    public void afficherTout(){
        
    }
    
    //retourne tous les sprints de l'étape
    public Sprint[] obtenirListeSprints(){
        return this.sprints;
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
    
}

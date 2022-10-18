/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author utiae
 */
public class Etape {
    //Attributs
    protected String villeDepartEtape;
    protected String villeArriveeEtape;
    protected float distance;
    
    //Constructeur
    public Etape(String villeDepartEtape, String villeArriveeEtape, float distance){
        this.villeArriveeEtape=villeArriveeEtape;
        this.villeDepartEtape=villeDepartEtape;
        this.distance=distance;
}
    
    //Les méthodes de la classe Etape
    
    public void afficherTout(){
        
    }
    
    
}

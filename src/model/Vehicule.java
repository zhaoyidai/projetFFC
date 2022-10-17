/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author zdai2
 */
public class Vehicule {
    protected int numV;
    protected String marqueV;
    protected String nomConducteur;
    protected String prenomConducteur;
    protected int numPermis;
    
    public Vehicule(int numV,String marqueV,String nomConducteur,String prenomConducteur,int numPermis){
        this.numV=numV;
        this.marqueV=marqueV;
        this.nomConducteur=nomConducteur;
        this.prenomConducteur=prenomConducteur;
        this.numPermis=numPermis;
    }
}

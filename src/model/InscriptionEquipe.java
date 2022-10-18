/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author zdai2
 */
public class InscriptionEquipe {
    public static int ID_GENE=0;
    protected int numE;
    protected String nomEquipe;
    protected String etatE;
    protected String nomCorrespondant;
    protected String nationaliteC;
    protected Date dateInsE;
    protected String contactCor;
    protected ArrayList<InscriptionCoureur> coureurs;
    //protected ArrayList<Vehicule> vehicules;
    
    public InscriptionEquipe(String nomEquipe,String nomCorrespondant,String nationaliteC,String contactCor){
        this.dateInsE= new Date();
        this.numE=ID_GENE;
        ID_GENE++;
        this.nomEquipe=nomEquipe;
        this.nomCorrespondant=nomCorrespondant;
        this.nationaliteC=nationaliteC;
        this.contactCor=contactCor;
        this.etatE="en constitution";
        this.coureurs=new ArrayList();
        //this.vehicules=new ArrayList();
    }
//    public void ajouterVehicule(int numV,String marqueV,String nomConducteur,String prenomConducteur,int numPermis){
//        Vehicule v1=new Vehicule(numV,marqueV,nomConducteur,prenomConducteur,numPermis);
//        vehicules.add(v1);
//    }
    /*public void ajouterVehicule(Vehicule v1){
        
        vehicules.add(v1);
    }*/
    public void ajouterCoureur(InscriptionCoureur ic){
        coureurs.add(ic);
    }
    public void inviterCoureur(InscriptionCoureur ic){
        ic.invitation=this;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    public int getNumE() {
        return numE;
    }

    public String getNomEquipe() {
        return nomEquipe;
    }

    public String getEtatE() {
        return etatE;
    }

    public String getNomCorrespondant() {
        return nomCorrespondant;
    }

    public String getNationaliteC() {
        return nationaliteC;
    }

    public Date getDateInsE() {
        return dateInsE;
    }

    public String getContactCor() {
        return contactCor;
    }

    public ArrayList<InscriptionCoureur> getCoureurs() {
        return coureurs;
    }

    public void setNomEquipe(String nomEquipe) {
        this.nomEquipe = nomEquipe;
    }

    public void setEtatE(String etatE) {
        this.etatE = etatE;
    }

    public void setNomCorrespondant(String nomCorrespondant) {
        this.nomCorrespondant = nomCorrespondant;
    }

    public void setNationaliteC(String nationaliteC) {
        this.nationaliteC = nationaliteC;
    }

    public void setContactCor(String contactCor) {
        this.contactCor = contactCor;
    }
    
    
    
    
}

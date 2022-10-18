/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Calendar;
/**
 *
 * @author zdai2
 */
public class Coureur {
    protected int numCoureur;
    public static int ID_GEN=0;
    protected String nomCoureur;
    protected String prenomCoureur;
    protected Calendar dateNaissance;
    protected String groupeSanguin;
    protected String rhesus;
    protected String nationaliteC;
    
    public Coureur(String nomCoureur,String prenomCoureur,int annee,int mois,int jour,String nationaliteC,String groupeSanguin,String rhesus){
        this.nomCoureur=nomCoureur;
        this.prenomCoureur=prenomCoureur;
        this.dateNaissance.set(annee, mois, jour);
        this.groupeSanguin=groupeSanguin;
        this.rhesus=rhesus;
        this.nationaliteC=nationaliteC;
        this.numCoureur=ID_GEN;
        ID_GEN++;
    }

    

    public void setNomCoureur(String nomCoureur) {
        this.nomCoureur = nomCoureur;
    }

    public void setPrenomCoureur(String prenomCoureur) {
        this.prenomCoureur = prenomCoureur;
    }

    public void setDateNaissance(Calendar dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public void setGroupeSanguin(String groupeSanguin) {
        this.groupeSanguin = groupeSanguin;
    }

    public void setRhesus(String rhesus) {
        this.rhesus = rhesus;
    }

    public int getNumCoureur() {
        return numCoureur;
    }

    public String getNomCoureur() {
        return nomCoureur;
    }

    public String getPrenomCoureur() {
        return prenomCoureur;
    }

    public Calendar getDateNaissance() {
        return dateNaissance;
    }

    public String getGroupeSanguin() {
        return groupeSanguin;
    }

    public String getRhesus() {
        return rhesus;
    }
    
    
    
}

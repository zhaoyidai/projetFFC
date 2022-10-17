/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author zdai2
 */
public class InscriptionCoureur {
    public static int ID_GEN1=0;
    protected int numInsCoureur;
    protected String etatCoureur;
    protected Coureur c;
    protected Date dateInsC;
    
    public InscriptionCoureur(){
        this.dateInsC= new Date();
        this.etatCoureur="en attente d’invitation";
        this.numInsCoureur=ID_GEN1;
        ID_GEN1++;
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    public String getEtatCoureur() {
        return etatCoureur;
    }

    public void setEtatCoureur(String etatCoureur) {
        this.etatCoureur = etatCoureur;
    }

    public Coureur getC() {
        return c;
    }

    public void setC(Coureur c) {
        this.c = c;
    }

    public int getNumInsCoureur() {
        return numInsCoureur;
    }
    
}

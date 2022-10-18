/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;
import java.util.Hashtable;

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
    protected InscriptionEquipe invitation;
    
    //instantiation de col et sprint dans inscriptioncoureur 
    protected Hashtable<Col, ClassementCol>cols;
    protected Hashtable<Sprint, ClassementSprint>sprints;
    protected Hashtable<Etape,ClassementCoureur> classementEta;
    
    public InscriptionCoureur(){
        this.classementEta = new Hashtable();
        this.dateInsC= new Date();
        this.etatCoureur="en attente d’invitation";
        this.numInsCoureur=ID_GEN1;
        ID_GEN1++;
        this.cols = new Hashtable<Col, ClassementCol>();
        this.sprints = new Hashtable<Sprint, ClassementSprint>();

    }
    public void accepterRefuser(boolean yn){
        if(yn==true){
            this.etatCoureur="dans une équipe";
            invitation.coureurs.add(this);
        }
        else{
            this.invitation=null;
        }
    }

    public Hashtable<Etape, ClassementCoureur> getClassementEta() {
        return classementEta;
    }

    public void enregistrerTemps(Etape e,float temps){
        ClassementCoureur cc1=new ClassementCoureur(temps);
        this.classementEta.put(e, cc1);
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
    
    public void creerClassementSprint(int ordreSprint, Sprint sprints){
        ClassementSprint classSprint = new ClassementSprint(ordreSprint);
        this.sprints.put(sprints, classSprint);
        
        if(sprints.getSprintFinal()== false){
            switch (ordreSprint){
                
                case 1:
                    classSprint.setPointSprint(5);
                    break;
                case 2:
                    classSprint.setPointSprint(3);
                    break;
                case 3:
                    classSprint.setPointSprint(2);
                    break;
                case 4:
                    classSprint.setPointSprint(1);
                    break;
                default:
                    break;
            }
        }else{
                    
            switch (ordreSprint){
                
                case 1:
                    classSprint.setPointSprint(10);
                    break;
                case 2:
                    classSprint.setPointSprint(6);
                    break;
                case 3:
                    classSprint.setPointSprint(4);
                    break;
                case 4:
                    classSprint.setPointSprint(2);
                    break;
                default:
                    break;
            }
        }
    }
    
    public void creerClassementCol(int ordreCol, Col cols){
        ClassementCol classCol = new ClassementCol(ordreCol);
        this.cols.put(cols, classCol);
        
        if(cols.getColFinal()== false){
            switch (ordreCol){
                
                case 1:
                    classCol.setPointCol(5);
                    break;
                case 2:
                    classCol.setPointCol(3);
                    break;
                case 3:
                    classCol.setPointCol(2);
                    break;
                case 4:
                    classCol.setPointCol(1);
                    break;
                default:
                    break;
                }
        }else{
                switch (ordreCol){
                
                case 1:
                    classCol.setPointCol(10);
                    break;
                case 2:
                    classCol.setPointCol(6);
                    break;
                case 3:
                    classCol.setPointCol(4);
                    break;
                case 4:
                    classCol.setPointCol(2);
                    break;
                default:
                    break;
            }
        }
    }
    
    public Hashtable getCols(){
        return this.cols;
    }
    
    public Hashtable getSprints(){
        return this.sprints;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author HDiana
 */
public class ClassementGC {
    protected int classementGC;
    protected String etatGC;

    
    public ClassementGC(){

        this.etatGC = "non valid";
    }

    public void afficherClassementGC(){
        
    }

    public int getClassementGC(){
        return classementGC;
    }


    
    public void validerClassement(){
        this.etatGC="valide";
    }
}

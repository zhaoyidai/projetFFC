/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author HDiana
 */
import java.util.ArrayList;

public class ClassementCoureur {
    protected int classementC;
    protected float temps;
    
    
    //hashtable de edition et coureur
    
    public ClassementCoureur(float temps){
//        this.classementC = classementC;
        this.temps = temps;
    }

    public void setClassementC(int classementC) {
        this.classementC = classementC;
    }

    public int getClassementC() {
        return classementC;
    }

    public float getTemps() {
        return temps;
    }
    

}

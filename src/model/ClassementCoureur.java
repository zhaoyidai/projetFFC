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

    @Override
    public int hashCode() {
        int hash = 7;
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
        final ClassementCoureur other = (ClassementCoureur) obj;
        if (this.classementC != other.classementC) {
            return false;
        }
        return Float.floatToIntBits(this.temps) == Float.floatToIntBits(other.temps);
    }
    

}

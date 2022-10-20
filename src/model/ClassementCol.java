/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author HDiana
 */
public class ClassementCol {
    protected int pointCol;
    protected int ordreCol;
    
    public ClassementCol(int ordreCol){
        this.ordreCol = ordreCol;
    }
    
    public void setPointCol(int pointCol){
        this.pointCol = pointCol;
    }
    
    public int getPointCol(){
        return this.pointCol;
    }

    @Override
    public int hashCode() {
        int hash = 5;
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
        final ClassementCol other = (ClassementCol) obj;
        if (this.pointCol != other.pointCol) {
            return false;
        }
        return this.ordreCol == other.ordreCol;
    }
    
}

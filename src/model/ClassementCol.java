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
}

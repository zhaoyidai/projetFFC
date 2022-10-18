/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author HDiana
 */
public class ClassementSprint {
    protected int pointSprint;
    protected int ordreSprint;
    
    public ClassementSprint(int ordreSprint){
        this.ordreSprint = ordreSprint;
    }
    
    public void setPointSprint(int pointSprint){
        this.pointSprint = pointSprint;
    }
    
    public int getPointSprint(){
        return this.pointSprint;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author zdai2
 */
public class Sprint {
    protected int codeSprint;
    protected boolean sprintFinal;
    
    public Sprint (int codeSprint, boolean sprintFinal){
        this.codeSprint=codeSprint;
        this.sprintFinal=sprintFinal;
    }
    
    public int getCodeSprint(){
        return this.codeSprint;
    }
    
    public boolean getSprintFinal(){
        return this.sprintFinal;
    }

    public boolean equals(Object o){
        Sprint s1 = (Sprint)o;
        if(s1.getCodeSprint() == (this.getCodeSprint())){
            return true;
        }
        return false;
    }
    public int hashCode(Object o){
        return this.codeSprint;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author zdai2
 */
public class Col {
    private int codeCol;
    private boolean colFinal;
    
    public Col(int codeCol, boolean colFinal){
        this.codeCol=codeCol;
        this.colFinal=colFinal;
    }
    
    public int getCodeCol(){
        return this.codeCol;
    }
    
    public boolean getColFinal(){
        return this.colFinal;
    }

}

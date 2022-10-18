/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.util.ArrayList;

/**
 *
 * @author mc
 */
public class Course {
    //Attributs
    protected String nomCourse;
    protected String villeDepartC;
    protected String villeArriveeC;
    protected String paysDepartC;
    protected String paysArriveeC;
    protected String typeCourse;
    protected ArrayList<Edition> editions;
    
    //Constructeur
    public Course(){
        this.editions= new ArrayList<Edition>();
    }
    
    //Les méthodes de la classe Course
    public void getListeEditions(){
        
    }
    
    public void getListeEtapes(){
        
    }
    
}

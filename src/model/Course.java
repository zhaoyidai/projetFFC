/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

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
    
    //Constructeur
    public Course(String nomCourse, String villeDepartC, String villeArriveeC, String paysDepartC, String paysArriveeC, String typeCourse){
        this.nomCourse=nomCourse;
        this.villeDepartC=villeDepartC;
        this.villeArriveeC=villeArriveeC;
        this.paysDepartC=paysDepartC;
        this.paysArriveeC=paysArriveeC;
        this.typeCourse=typeCourse;
    }
    
}

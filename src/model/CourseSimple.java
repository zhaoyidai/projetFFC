/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import Model.Etape;

/**
 *
 * @author utiae
 */
public class CourseSimple extends Course {
    //Attributs
    protected Etape etape;
    
    //Constructeur
    public CourseSimple(String nomCourse, String villeDepartC, String villeArriveeC, String paysDepartC, String paysArriveeC, String typeCourse){
        super();
        super.nomCourse=nomCourse;
        super.paysDepartC=paysDepartC;
        super.paysArriveeC=this.paysArriveeC;
        super.villeDepartC=villeDepartC;
        super.villeArriveeC=villeArriveeC;
        super.typeCourse=typeCourse;
    }
    
    //Les méthodes de la classe CourseSimple
    
}

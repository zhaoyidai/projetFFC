/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.util.Hashtable;

/**
 *
 * @author utiae
 */
public class CourseEtape extends Course {
    //Attributs
    protected Hashtable<Composer,Etape> etapes;
    
    //Constructeur

    
    
    public CourseEtape(String nomCourse, String villeDepartC, String villeArriveeC, String paysDepartC, String paysArriveeC, String typeCourse){
        super();
        super.nomCourse=nomCourse;
        super.paysDepartC=paysDepartC;
        super.paysArriveeC=this.paysArriveeC;
        super.villeDepartC=villeDepartC;
        super.villeArriveeC=villeArriveeC;
        super.typeCourse=typeCourse;
        this.etapes = new Hashtable<Composer, Etape>();
    }
    
    // Les méthodes de la classe CourseEtape
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author mc
 */
public class Partenaire {
    private String nomPartenaire;
    private String contactPart; //email
    
    public Partenaire(String nomPartenaire, String contactPart){
        this.nomPartenaire = nomPartenaire;
        this.contactPart = contactPart;
    }
    
    public String getNomPart(){
        return this.nomPartenaire;
    }
    
    public String getContactPart(){
        return this.contactPart;
    }
    
    public void setNomPart(String nomPart){
        this.nomPartenaire = nomPart;
    }
    
    public void setContactPart(String cont){
        this.contactPart = cont;
    }
}

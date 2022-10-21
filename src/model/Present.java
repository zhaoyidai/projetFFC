/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Scanner;
import vue.ConsulterCourse;
import sql1.sqlconnect;
import java.sql.*;

/**
 *
 * @author zdai2
 */
public class Present {
    public static void main(String[] args) {
        System.out.println("*******Bienvenue dans la Systeme de FFC gestion des course*******");
        boolean continuestep=true;
        while(continuestep){
            System.out.println("1.creer une edition");
            System.out.println("2.s'inscire dans une édition");
            System.out.println("3.inscrire une equipe");
            System.out.println("4.ajouter un coureur");
            System.out.println("5.accepter ou refuser pour une ivitation equipe");
            System.out.println("6.consulter le classement Etape pour les coureur");
            System.out.println("7.consulter le classement general pour les coureur");
            System.out.println("10.Consulter course");
            System.out.println("!!!!Saisir 0 pour finir!!!!");
            Scanner scan=new Scanner(System.in);
            System.out.print("Saisir nb : ");
            int num = scan.nextInt();
            
            if(num==0){
                System.out.print("Ciao");
                continuestep=false;
            }
            switch(num){
                case 1:
                    System.out.println("--Creer une edition--");
                    System.out.println("");
                    System.out.println("Finir");
                    System.out.println("******************************************");
                    break;
                case 2:
                    System.out.println("s'inscire dans une edition");
                    System.out.println("");
                    PresentInscription pi=new PresentInscription();
                    pi.getAllCoureurs();
                    pi.InscrireCoureurs();
                    
                    System.out.println("Finir");
                    System.out.println("******************************************");
                    break;
                case 3:
                    System.out.println("inscire une equipe");
                    System.out.println("");
                    PresentInscription p1=new PresentInscription();
                    p1.CreerEquipe();
                    
                    
                    System.out.println("Finir");
                    System.out.println("******************************************");
                    break;
                    
                    
                    
                case 4:
                    System.out.println("ajouter un coureur");
                    System.out.println("");
                    PresentInscription p2=new PresentInscription();
                    p2.ajouterCoureur();
                    
                    System.out.println("Finir");
                    System.out.println("******************************************");
                    break;
                case 5:
                    
                    System.out.println("accepter refuser");
                    System.out.println("");
                    PresentInscription p3=new PresentInscription();
                    p3.accepterRefuser();
                    
                    System.out.println("Finir");
                    System.out.println("******************************************");
                    break;
                case 6:
                    
                    System.out.println("consulter classement etape");
                    System.out.println("");
                    PresentInscription p4=new PresentInscription();
                    p4.classementE();
//                    p4.classementEE();
                    System.out.println("Finir");
                    System.out.println("******************************************");
                    break;
                case 7:
                    
                    System.out.println("consulter classement edition");
                    System.out.println("");
                    PresentInscription p5=new PresentInscription();
                    p5.classementEdition();
//                    p5.classementEditionE();
                    System.out.println("Finir");
                    System.out.println("******************************************");
                    break;
                case 10:
                    System.out.println("Consulter");
                    java.awt.EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        new ConsulterCourse().setVisible(true);
                    }
                        });
                    break;
                default:
                    break;
            }
        }
    }
}

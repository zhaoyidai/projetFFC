/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import sql.sqlconnect;
import java.sql.*;


import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author zdai2
 */
public class Coureur {
    protected int numCoureur;
    public static int ID_GEN=0;
    protected String nomCoureur;
    protected String prenomCoureur;
    protected Calendar dateNaissance=Calendar.getInstance();
    protected String groupeSanguin;
    protected String rhesus;
    protected String nationaliteC;
    
    public Coureur(String nomCoureur,String prenomCoureur){
        this.nomCoureur=nomCoureur;
        this.prenomCoureur=prenomCoureur;
//        this.dateNaissance.set(annee, mois, jour);
//        this.groupeSanguin=groupeSanguin;
//        this.rhesus=rhesus;
//        this.nationaliteC=nationaliteC;
        this.numCoureur=ID_GEN;
        ID_GEN++;
    }

    

    public void setNomCoureur(String nomCoureur) {
        this.nomCoureur = nomCoureur;
    }

    public void setPrenomCoureur(String prenomCoureur) {
        this.prenomCoureur = prenomCoureur;
    }

    public void setDateNaissance(int annee,int mois,int jour) {
        this.dateNaissance.set(annee, mois, jour);
    }

    public void setNationaliteC(String nationaliteC) {
        this.nationaliteC = nationaliteC;
    }
    
    public void setGroupeSanguin(String groupeSanguin) {
        this.groupeSanguin = groupeSanguin;
    }

    public void setRhesus(String rhesus) {
        this.rhesus = rhesus;
    }

    public int getNumCoureur() {
        return numCoureur;
    }

    public String getNomCoureur() {
        return nomCoureur;
    }

    public String getPrenomCoureur() {
        return prenomCoureur;
    }

    public Calendar getDateNaissance() {
        return dateNaissance;
    }

    public String getGroupeSanguin() {
        return groupeSanguin;
    }

    public String getRhesus() {
        return rhesus;
    }
    
    public void uploadCoureur(){
        PreparedStatement Preparesql;
	 sqlconnect con=new sqlconnect();//sqlconnect 
	
	Connection conn;  //定义Connection型的conn
    
        conn=(Connection) con.getConnection();//链接数据库
        
	try {
            Statement st;
            st = conn.createStatement();
            
            String Value_sql="insert into coureur values ('"+this.numCoureur+"','" +this.nomCoureur+"','"+this.prenomCoureur+"',"+null+",'"+this.groupeSanguin+"','"+this.rhesus+"','"+this.nationaliteC+"');";
//            System.out.println(Value_sql);
            st.executeUpdate(Value_sql);//执行预处理语句

	
	} catch (Exception e) {
		e.printStackTrace();
	}finally{
            con.sqlclose();//关闭数据库节省系统资源
			
	}
    }


    
}

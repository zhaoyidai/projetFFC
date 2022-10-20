/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.awt.Color;
import java.sql.*;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import sql.sqlconnect;



public class Etapes extends JFrame {
    JPanel panel=(JPanel)getContentPane();
    JTable table=new JTable();
    JScrollPane jScrollpane=new JScrollPane(table);
    DefaultTableModel tablemodel=new DefaultTableModel();
    String[] columnNames = {"Ordre","Ville depart", "Ville arrivee","Distance"};
    Vector <String> setvec= new Vector<String>();
    String[][] tableValues;
    JButton bnt=new JButton();
        
    PreparedStatement Preparesql;
    sqlconnect con=new sqlconnect();
    Connection conn;
    
    //Constructeur
    public Etapes() throws SQLException{
        super("Etapes de la course");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(456, 418);
        this.setLocationRelativeTo(null);
        tablepaint();
        Init();
        this.setVisible(true);
    }
    public void tablepaint() throws SQLException{
        Object[][] tableValues = {}; 
        Vector<String> vec = null;
        tablemodel = new DefaultTableModel(tableValues, columnNames){
            public boolean isCellEditable(int row , int column) {
                return false;
            }
        };
        conn=(Connection)con.getConnection();
        try {
            String Value_sql="select ordreEtape,villeDepartEtape,villeArriveeEtape, distance from etape where CodeCourse=1";
            Preparesql=conn.prepareStatement(Value_sql);
            ResultSet res=Preparesql.executeQuery();
            System.out.println(Value_sql);
            while (res.next()) {
                vec = new Vector<String>();
                vec.add(res.getString("ordreEtape"));
                vec.add(res.getString("villeDepartEtape"));
                vec.add(res.getString("villeArriveeEtape"));
                vec.add(res.getString("distance"));
                System.out.println("SearchTable"+vec);
                tablemodel.addRow(vec);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            conn.close();
        }
    }
    //Mise en page
    
    
    //Remplissages des données des étapes
    public void Init(){
        table=new JTable(tablemodel);
        jScrollpane.setBounds(10 ,10 ,430,300);
        panel.add(jScrollpane);
        panel.add(table);
        jScrollpane.getViewport().add(table, null);

	table.setRowSorter(new TableRowSorter< >(tablemodel));
	table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
	table.setRowHeight(36);
	table.setGridColor(Color.blue);
	table.setDragEnabled(true);
	table.setSelectionForeground(Color.white);
	table.setSelectionBackground(Color.gray);
	table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
	table.setRowSelectionAllowed(true);
	table.setShowVerticalLines(true);
	table.getTableHeader().setReorderingAllowed(false);
    }
	
    public static void main(String[] args) throws SQLException {
	// TODO Auto-generated method stub
	new Etapes();
    }
}


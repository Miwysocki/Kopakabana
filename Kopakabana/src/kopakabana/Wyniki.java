/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kopakabana;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JTable;

/**
 *
 * @author tuptu
 */
public class Wyniki extends JFrame{
    
    JTable table;
    int teamsAmmount;
    String[] collumnNames = {"Druzyna" , "Points"};
    Object[][] data;
    public Wyniki(int teamsAmmount){
        super("UWr coders"); // set name here;
        this.setSize(300, 200);
        this.teamsAmmount = teamsAmmount;
        setLocationRelativeTo(null);
        
        //JUST NOW BECASUE Baza.druzyny.size() is 0 !!!!!!!!!!!!!!
        // NOW I USE FINAL 2 BECASUE I SET 2 TEAMS ONLY
        teamsAmmount = 2;
        
        
        data = new Object[teamsAmmount][2];
        
        setLayout(new FlowLayout());
       
        /*
        for(int i = 0 ; i < Baza.druzyny.size() ; i++){
            data[i][0] = Baza.druzyny.get(i).getName();
            data[i][1] = Baza.druzyny.get(i).getPoints();
            
        }
        
        //THIS IS NOT YET CONNECTED. ALLOW USER TO ADD MATCHES RESULTS
        */
        
        data[0][0] = "team1";
        data[0][1] = 12;
        
        data[1][0] = "team2";
        data[1][1] = 4;
        
        
        table = new JTable(data,collumnNames);
        add(table);
        
        this.setVisible(true);
        
        
    }
    
    
    
}

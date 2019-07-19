/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kopakabana;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;



/**
 *
 * @author Student
 */
public class Druzyna implements Comparable<Druzyna> {
    Scanner scan = new Scanner(System.in);    
    List <Osoba> sklad = new LinkedList<>();
    String nazwa;
//<<<<<<< HEAD
 //   int id, punkty;
//=======
    int id;
    Integer punkty;
//>>>>>>> origin/master
    Druzyna(){
        this.punkty = 0;
    }
//<<<<<<< HEAD
    
    public String getName(){
        return nazwa;
    }
    
    public int getPoints(){
        return punkty;
    }
    

//=======
    public Integer getPunkty()
    {return punkty;}
    @Override 
    public int compareTo(Druzyna o) {
      return this.getPunkty().compareTo(o.getPunkty());
    }
    @Override
    public String toString(){
    String wynik;
    wynik=nazwa+" "+id+" "+punkty+"\n";
    return wynik;
    }
 }

//>>>>>>> origin/master

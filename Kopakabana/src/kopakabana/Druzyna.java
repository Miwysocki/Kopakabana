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
public class Druzyna {
    Scanner scan = new Scanner(System.in);    
    List <Druzyna> druzyny = new LinkedList<>();
    List <Osoba> sklad = new LinkedList<>();
    String nazwa;
    int id,punkty;
    
    void zglos(){
        Druzyna r = new Druzyna();
        System.out.println("Podaj nazwe druzyny ");
        r.nazwa = scan.nextLine();
        System.out.println("Podaj id druzyny ");
        r.id = scan.nextInt();
        r.punkty = 0;
        druzyny.add(r);
    }
   
    void przeglad(){
        for (Druzyna i : druzyny){
            System.out.println(i.nazwa+" "+i.punkty);
            }
        }
    
    void wycofaj(){
        
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kopakabana;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


/**
 *
 * @author Student
 */
public class Druzyna {
    Scanner scan = new Scanner(System.in);    
    List <Osoba> sklad = new LinkedList<>();
    String nazwa;
    int id,punkty;
    
    Druzyna zglos(){
        Druzyna r = new Druzyna();
        System.out.println("Podaj nazwe druzyny ");
        r.nazwa = scan.nextLine();
        System.out.println("Podaj id druzyny ");
        r.id = scan.nextInt();
        r.punkty = 0;
        return r;
    }
}

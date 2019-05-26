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
public class Sedzia extends Osoba{

    public Sedzia(int id, String imie, String nazwisko) {
        super(id, imie, nazwisko);
    }
    
    Scanner scan = new Scanner(System.in);
    List<Sedzia> sedziowie = new LinkedList<>();

     public Sedzia() {
    }
    
    void dodajSedziego(){
        Sedzia s = new Sedzia();
        System.out.println("Podaj id sedziego ");
         int nr = scan.nextInt();
         s.id = nr;
        System.out.println("Podaj imie i nazwisko sedziego ");
         s.imie = scan.nextLine();
         s.nazwisko = scan.nextLine();
        sedziowie.add(s);
       
    }
    void usunSedziego(){
        System.out.println("Podaj imie i nazwisko sedziego ");
        String im = scan.nextLine();
        String nazw = scan.nextLine();
        boolean znaleziono = false;
        for(Sedzia s : sedziowie)
        {
            if(s.imie.equals(im) && s.nazwisko.equals(nazw)){
                sedziowie.remove(s);
                znaleziono = true;
                System.out.println("usunieto");
            }
        }
        if(znaleziono == false) System.out.println("nie znazleziono takiej owoby w bazie");
    }
    void przeglad(){
        for (Sedzia i : sedziowie){
            System.out.println(i.imie+" "+i.nazwisko);
        }
    }
}

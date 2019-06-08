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
 * @author tuptu
 */
public class Baza { 
    //statyczne    
    public static  List<Sedzia> sedziowie = new LinkedList<>();
    public static List <Druzyna> druzyny = new LinkedList<>(); 
    public static List <Osoba> gracze = new LinkedList<>();
    
    void usun(Osoba szukana, String x){
        switch(x){
            case "s":
        }
    }
    
    Scanner scan = new Scanner(System.in);
    void pokaz_sedziow(){
        for (Sedzia i : sedziowie){
            System.out.println(i.imie+" "+i.nazwisko);
        }
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

    
   public void pokaz_druzyny(){ //tabela wyników
        for (Druzyna i : druzyny){
            System.out.println(i.nazwa+" punkty: "+i.punkty);
            }
        }    
    void wycofaj_druzyne(){
        System.out.println("podaj nazwe druzyn którą chcesz wycofać");
        String nazw = scan.nextLine();
        boolean znaleziono = false;
        for(Druzyna d : druzyny){
            if(d.nazwa.equals(nazw)){
                druzyny.remove(d);
                znaleziono = true;
                System.out.println("usunieto");
            }
        }
        if(znaleziono == false) System.out.println("nie znaleziono takiej druzyny w bazie");
    }
}

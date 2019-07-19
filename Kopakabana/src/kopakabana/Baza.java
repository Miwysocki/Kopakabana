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
    public static  List<Mecz> mecze_siatkowka = new LinkedList<>();
    public static  List<Mecz> mecze_ognie = new LinkedList<>();
    public static  List<Mecz> mecze_lina = new LinkedList<>();
    public static  List<Sedzia> sedziowie = new LinkedList<>();
    public static List <Druzyna> druzyny = new LinkedList<>(); 
    public static List <Osoba> gracze = new LinkedList<>();
    public static List <Druzyna> finalisci = new LinkedList<>();

    
    void pokaz_sedziow(){
        for (Sedzia i : sedziowie){
            System.out.println(i.imie+" "+i.nazwisko);
        }
    }    

}

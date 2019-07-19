/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kopakabana;

/**
 *
 * @author Student
 */
public class Osoba {
    public static int id = 0;
    public Osoba(){};
    public Osoba(int id, String imie, String nazwisko) {
        this.id = id;
        this.imie = imie;
        this.nazwisko = nazwisko;
    }
    String imie, nazwisko;
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kopakabana;
import java.util.Random;

/**
 *
 * @author tuptu
 */
public class Mecz {
    String dyscyplina;
    Druzyna gospodarze;
    Druzyna goscie;
    Sedzia glowny;
    Sedzia pomocniczy_1; 
    Sedzia pomocniczy_2;
    float pkt_gosp, pkt_gosci; //punkty 
    String wynik = pkt_gosp+":"+pkt_gosci;
    
    public Mecz(){};
    public String getWynik() {
        return wynik;
    }
    public Mecz Final(Druzyna a, Druzyna b)
    {
        Random generator=new Random();
        gospodarze=a;
        goscie=b;
        gospodarze.id=1;
        goscie.id=2;
        pkt_gosp=generator.nextInt(10);
        pkt_gosci=generator.nextInt(10);
        if(pkt_gosp>pkt_gosci)
        {gospodarze.punkty+=3;}
        else if(pkt_gosp<pkt_gosci)
        {goscie.punkty+=3;}
        else
        {gospodarze.punkty+=1;
        goscie.punkty+=1;}
        return this;
    }
    
}

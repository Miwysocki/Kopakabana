/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kopakabana;
import static kopakabana.Baza.druzyny;
import static kopakabana.Baza.finalisci;
import java.util.Collections;
import java.util.Random;


/**
 *
 * @author proya
 */
public class Turniej {
    public Turniej(){

    };

    public void generujTurniej()
    {   
        int c=1;
        for(Druzyna a:druzyny)
        {
            a.id=c;
            c++;
        }
        Random generator = new Random();
        int coin;
        for(int j=0; j<druzyny.size()-1; j++)
        {
        for(int i=1; i<druzyny.size(); i++)
        {
        coin=generator.nextInt(6);
            switch (coin%3) {
                case 0:
                    druzyny.get(j).punkty+=3;
                    break;
                case 1:
                    druzyny.get(i).punkty+=3;
                    break;
                default:
                    druzyny.get(j).punkty+=1;
                    druzyny.get(i).punkty+=1;
                    break;
            }
        }
        }
        
        int i=0;
        Collections.sort(druzyny, Collections.reverseOrder());
        for(Druzyna d:druzyny)
        {
            if (i<4)
            {
                finalisci.add(d);
            }
        }
        
    }
    @Override public String toString()
    {
        String wynik="";
        for(Druzyna d:druzyny)
        {
        wynik+=d.toString();
        }
        return wynik;
    }
}

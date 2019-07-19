/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kopakabana;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Student
 */
public class Sedzia extends Osoba implements Serializable{

    public Sedzia(int id, String imie, String nazwisko) {
        super(id, imie, nazwisko);
    } 
     public Sedzia() {
    }
   
     /*
    public void save(String fileName) throws FileNotFoundException {
    PrintWriter pw = new PrintWriter(new FileOutputStream(fileName));
    for (Sedzia s : sedziowie)
        pw.println(s.imie);
    pw.close();
}
        public void WriteObjectToFile(Sedzia serObj) {
 
        try {
 
            FileOutputStream fileOut = new FileOutputStream("sedziowie.txt");
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(serObj);
            objectOut.close();
            System.out.println("The Object  was succesfully written to a file");
 
        } catch (IOException ex) {
        }
    }
        
    public Sedzia ReadObjectFromFile() {
 
        try {
 
            FileInputStream fileIn = new FileInputStream("sedziowie.txt");
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
 
            Sedzia  obj = (Sedzia) objectIn.readObject();
 
            System.out.println("The Object has been read from the file");
            objectIn.close();
            return obj;
 
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }        
    
    void wczytaj_sedziow() throws FileNotFoundException, IOException{
        FileInputStream fis = new FileInputStream("sedziowie.tmp");
        try (ObjectInputStream ois = new ObjectInputStream(fis)) {
            sedziowie = (List<Sedzia>) ois.readObject();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Sedzia.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException e ){
            System.out.println(" Nie znaleziono bazy sędziów!");
        }
    } 
    
    void zapisz_sedziow() throws FileNotFoundException{
        ObjectOutputStream oos = null;
        try {
            FileOutputStream fos = new FileOutputStream("sedziowie.tmp");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(sedziowie);
            oos.close();
        } catch (IOException ex) {
            Logger.getLogger(Sedzia.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                oos.close();
            } catch (IOException ex) {
                Logger.getLogger(Sedzia.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
*/
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package struktur.data;

/**
 *
 * @author Windows 10
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class StrukturData {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List daftarAngka = new ArrayList();
        daftarAngka.add("7");
        daftarAngka.add("5");
        daftarAngka.add("9");
        daftarAngka.add("8");
        daftarAngka.add("6");
        
        System.out.println("Sebelun Diurutkan");
        System.out.println(daftarAngka);
        
        Collections.sort(daftarAngka);
        System.out.println("Setelah Diurutkan");
        System.out.println(daftarAngka);
    }
    
}

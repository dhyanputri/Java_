/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bangun_datar;
import java.util.*;
/**
 *
 * @author Putri
 */
public class Bangundatar {
public static void main(String[] args) {
        int pil;
        Lingkaran L = new Lingkaran();
        Segitiga S = new Segitiga();
        Persegi B = new Persegi();
        Persegipanjang P = new Persegipanjang();
        Scanner inp = new Scanner(System.in);
        System.out.println("MENU");      
        System.out.println("====");      
        System.out.println("1. Lingkaran");
        System.out.println("2. Segitiga");      
        System.out.println("3. Persegi");      
        System.out.println("4. Persegi Panjang");      
        System.out.println("5. Exit");      
        System.out.print("Pilihan : ");
        pil = inp.nextInt();
        switch(pil){
            case 1 : L.Lingkaran();break;
            case 2 : S.Segitiga();break;
            case 3 : B.Persegi();break;
            case 4 : P.Persegipanjang();break;
            case 5 : System.exit(0);
        }
    }      
}

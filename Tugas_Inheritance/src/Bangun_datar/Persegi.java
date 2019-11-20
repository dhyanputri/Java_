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
public class Persegi extends Bangundatar{
public void Persegi(){
        double sb,lb,kb;
        Scanner c = new Scanner(System.in);
        System.out.println("Persegi");
        System.out.println("=============");
        System.out.println("Masukkan sisi : ");
        sb = c.nextDouble();      
        lb = sb*sb;
        kb = 4*sb;
        System.out.println("Luas Bujur Sangkar adalah : "+lb);
        System.out.println("Keliling Bujur Sangkar adalah : "+kb);
    }       
}
   
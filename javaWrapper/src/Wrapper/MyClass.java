/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Wrapper;
import java.util.ArrayList;
/**
 *
 * @author Putri
 */
public class MyClass {
    public static void main(String[]args){
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(10);
        myNumbers.add(15);
        myNumbers.add(20);
        myNumbers.add(25);
        for(int i : myNumbers){
            System.out.println(i);
            
        }
    }
    
}

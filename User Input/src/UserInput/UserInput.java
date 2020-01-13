/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInput;
import java.util.Scanner;
/**
 *
 * @author Putri
 */
public class UserInput {
    
    public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    System.out.println("Enter username");

    String userName = myObj.nextLine();
    System.out.println("Username dhyanput is: " + userName);
  }
}


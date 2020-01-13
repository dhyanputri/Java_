
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
public class InputTypes {
    public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);

    System.out.println("Enter name, age and Salary:");

    String name = myObj.nextLine();

    int age = myObj.nextInt();
    double salary= myObj.nextDouble();

    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("Salary: " + salary);
  }

}

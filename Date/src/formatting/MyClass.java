/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formatting;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Putri
 */
public class MyClass {
    public static void main(String[] args) {
        LocalDateTime myDateObj = LocalDateTime.now();
        System.out.println("Before formatting: " + myDateObj);
        DateTimeFormatter myFormatObj =DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        
        String formattedDate = myDateObj.format(myFormatObj);
        System.out.println("After Formatting : " + formattedDate);
    }
}
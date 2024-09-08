/*

Class: COP 2800: Java Programming
Instructor: Francis Fiskey
Description: *2.6 (Financial application: calculate tips) Write a program that reads the subtotal and the gratuity rate, then computes the gratuity and total.
Due: Sep 15 by 11:59pm
I pledge by honor that I have completed the programming assignment independently.
I have not copied the code from a student or any source.
I have not given my code to any student.
Sign here: ___Eric Snyder___

*/

import java.util.Scanner; // We are importin the Scanner class from java.util 

public class Main { // open the class block
    
    public static void main(String[] args) { // open the main method block

        // Create the scanner object "input" for user input
        Scanner input = new Scanner(System.in);

        // We ask the user to enter the subtotal
        System.out.print("Enter the subtotal: ");

        // The user enters a subtotal
        double subtotal = input.nextDouble();

        // We ask the user to enter the gratuity rate
        System.out.print("Enter the gratuity rate: ");

        // The user enters the gratuity rate
        double gratuityRate = input.nextDouble();

        /* Caculate the gratuity of the subtotal
           Cast it into an integer to truncate the decimal places */
        int truncatedGratuity = (int) (subtotal * (gratuityRate / 100) * 100);

        // Divide the truncated gratuity by 100.0 to get the desired two decimal places
        double formattedGratuity = truncatedGratuity / 100.0;
        
        // We calculate the total
        double total = subtotal + formattedGratuity;

        // We display the gratuity and the total
        System.out.println("The gratuity is $" + formattedGratuity + " and total is $" + total);

    } // We close the method block
    
} // We close the main block
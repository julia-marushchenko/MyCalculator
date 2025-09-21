// Java program to check if number can be divided by 3

package com.calculate;

import java.util.Scanner;

// Main class
public class Main {

    // Main method to run java program
    public static void main(String[] args) {

        // Creating value to store number read from console
        int number;

        // To read number from console with scanner object
        Scanner scanner = new Scanner(System.in);

        // Initialization number
        number = scanner.nextInt();

        if (number % 3 == 0) {

            // Printing answer to console
            System.out.println("Can be divided by 3.");
        } else {
            // Printing answer to console
            System.out.println("Cannot be divided by 3.");
        }

    }
}
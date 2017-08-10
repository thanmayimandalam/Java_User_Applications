package com.assignments;

import java.util.Scanner;

/**
 * Created by Thanmayi on 7/21/2017.
 */
public class Factorial {




    public static void main(String args[]){

        System.out.println("Welcome to the Factorial Calculator");
        FactCal();

    }

    static void FactCal() {

        int fact = 1;
        System.out.print("Enter an integer that's greater than 0 and less than 10: ");
        Scanner Scanner = new Scanner(System.in);
        int number = Scanner.nextInt();

        for (int i =1 ; i <= number; i++) {

           fact  = fact * i;
        }

        System.out.println("The factorial of   " +(number)+ "    is     " +(fact)+    ".");
        System.out.print("Continue? (y/n): ");
        choice();

    }

    static void choice() {


        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        if (input.equals("y") || input.equals("Y"))
           FactCal();
        else if (input.equals("n") || input.equals("N")) {

            System.out.println("Bye ...!!!");
        }
    }
}

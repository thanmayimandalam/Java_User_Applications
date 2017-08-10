package com.assignments;

import java.util.Scanner;

/**
 * Created by Thanmayi on 7/21/2017.
 */
public class Powers {

    public static void main (String args[]){

        System.out.println("Welcome to the Squares and Cubes table");
        PowerCal();


    }
    static void PowerCal(){

        System.out.print("Enter an integer: ");
        Scanner Scanner = new Scanner(System.in);
        int Input = Scanner.nextInt();
        System.out.println( "Number"+"  "+"Squared"+" "+"Cubed");
        System.out.println("======"+"  "+"======="+" "+"=====");
        for (int i = 1; i <= Input ; i++){

            int Square = (i * i);
            int Cube   = (i * i * i);

            System.out.println(+(i)+"       "+(Square)+"       "+(Cube));

        }
        System.out.print("Continue? (y/n): ");
        choice();

    }
    static void choice() {


        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        if (input.equals("y") || input.equals("Y"))
           PowerCal();
        else if (input.equals("n") || input.equals("N")) {

            System.out.println("Bye ...!!!");
        }
    }
}

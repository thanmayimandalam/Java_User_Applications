package com.assignments;

import java.util.Scanner;

/**
 * Created by Thanmayi on 7/19/2017.
 */
public class TravelTimeC {

    static float M1;
    static float M2;
    static int H;
    static int M;

    public static void main(String args[]){
        System.out.println("Welcome to the Travel Time Calculator");
        Time();
        //choice();

    }

    static void Time(){
        System.out.print("\nEnter miles:           ");
        Scanner Scanner = new Scanner(System.in);
        int M1 = Scanner.nextInt();
        System.out.print("Enter miles per hour:  ");
        int M2 = Scanner.nextInt();
        if (M1 > 0 &&  M2 > 0 ){
            H =  (M1/M2);
            System.out.println("\nEstimated travel time");
            System.out.println("Hours:   "+ (H));
            M = (H  * 60) ;
            System.out.println("Minutes: "+ (M));
            choice();

        }


    }
    static void choice(){

        System.out.print("\nContinue? (y/n): ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        if(input.equals("y") || input.equals("Y"))
           Time();
        else if (input.equals("n") || input.equals("N")){

            System.out.println("Bye ...!!!");
        }
    }
}


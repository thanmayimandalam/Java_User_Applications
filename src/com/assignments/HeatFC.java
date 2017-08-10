package com.assignments;

import java.util.Scanner;

/**
 * Created by Thanmayi on 7/19/2017.
 */
public class HeatFC {
    static float F;


    public static void main(String args[]){

        System.out.println("Welcome to the Temperature Converter");

        Temp();
        choice();

        }

        static void Temp(){
            System.out.print("Enter degrees in Fahrenheit:");
            Scanner scanner = new Scanner(System.in);
            float F = scanner.nextFloat();
            if (F >=32 && F<=212){
                F = ((F - 32)*5)/9;
                System.out.println("Degrees in Celsius: "+ F);
            }else return;


            System.out.println("Continue? (y/n):");
            choice();

        }
    static void choice(){


        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        if(input.equals("y") || input.equals("Y"))
        Temp();
        else if (input.equals("n") || input.equals("N")){

            System.out.println("Bye ...!!!");
        }

    }
}

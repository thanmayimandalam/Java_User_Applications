package com.assignments;

import sun.plugin2.message.Message;

import javax.naming.Name;
import java.util.Scanner;

/**
 * Created by Thanmayi on 7/18/2017.
 */
public class Z {

    static int Score;
    static String Grade;

    public static void main(String args[]) {
      Message("Thanu");
        Cal();

        choice();


    }
    static void Message(String Name){
        System.out.println("Welcome "+Name+" to the Letter Grade Converter");
    }
    static void Cal( ){

        System.out.print("Enter numerical grade:" );
        Scanner scanner = new Scanner(System.in);
        int  Score = scanner.nextInt();

        if (Score >= 88 && Score <= 100){
            System.out.println( "Letter grade:A ");
        }else if (Score >= 80 && Score <= 87){
            System.out.println( "Letter grade:B ");
        }else if (Score >=67 && Score <= 79){
            System.out.println( "Letter grade:C ");
        }else  if (Score >=60 && Score <= 67){
            System.out.println( "Letter grade:D");
        }else  if (Score < 60) {
            System.out.println( "Letter grade:E");
        }else return;

        System.out.println("Continue? (y/n):");
        choice();
    }
    static void choice(){


        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        if(input.equals("y") || input.equals("Y"))

        Cal();
        else if (input.equals("n") || input.equals("N")){

            System.out.println("Bye ...!!!");
        }

    }
}


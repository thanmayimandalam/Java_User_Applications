package com.assignments;/*
package com.company;

import java.util.Scanner;

*/
/**
 * Created by Thanmayi on 7/21/2017.
 *//*

public class ReturnMethodExample {

    static int thanu, chinna;
    ReturnMethodExample(int a, int b){

        thanu = a;
        chinna = b;

    }

    ReturnMethodExample(int a){

        thanu = a;


    }

    public static void main(String args[]){


        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        ReturnMethodExample obj =  new ReturnMethodExample(a);

        // System.out.println(chinna+thanu);



        System.out.println(thanu+chinna);
        obj.minMax();
        obj.choice();


    }

    void minMax(){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter A value :");
        int a = scanner.nextInt();
        System.out.print("Please enter B value :");
        int b = scanner.nextInt();

        System.out.println("Min value is :"+(minValue(a,b)));
        System.out.println("Max value is :"+(maxValue(a,b)));

        choice();

    }

    void minMax(int a, int b){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter A value :");
        int a = scanner.nextInt();
        System.out.print("Please enter B value :");
        int b = scanner.nextInt();

        System.out.println("Min value is :"+(minValue(a,b)));
        System.out.println("Max value is :"+(maxValue(a,b)));

        choice();

    }

    void minMax(int a, int b, int c){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter A value :");
        int a = scanner.nextInt();
        System.out.print("Please enter B value :");
        int b = scanner.nextInt();

        System.out.println("Min value is :"+(minValue(a,b)));
        System.out.println("Max value is :"+(maxValue(a,b)));

        choice();

    }

    static int minValue(int a, int b){

        int result = 0;
        if (a > b){

            result = b;
        }else {
            result = a;
        }

        return result;
    }

    static int maxValue(int a, int b){

        int result = 0;
        if (a < b){

            result = b;
        }else {
            result = a;
        }

        return result;
    }

    void choice() {

        System.out.print("\nContinue? (y/n): ");

        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        if (input.equals("y") || input.equals("Y"))
            minMax();
        else if (input.equals("n") || input.equals("N")) {

            System.out.println("Bye ...!!!");
        }
    }


}

*/

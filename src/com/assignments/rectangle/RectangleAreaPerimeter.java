package com.assignments.rectangle;

import java.util.Scanner;


/**
 * Created by Thanmayi on 7/18/2017.
 */
public class RectangleAreaPerimeter {

    public static void main(String args[]){

        welcomeMsg("thanu");

        calc();

    }

    static void calc(){

        System.out.print("Enter length: ");

        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();

        System.out.println("/n");
        System.out.print("Enter width:  ");
        int width = scanner.nextInt();

        //System.out.println("Area:         "+(l*w));
        //]System.out.println("Perimeter:    "+(2*(length + width)));

        System.out.println("Area:         "+Area(length,width));
        System.out.println("Perimeter:    "+Perimeter(length,width));


    }



     void choice(){

        System.out.print("Continue? (y/n): ");
      Scanner scanner = new Scanner(System.in);
      String input = scanner.next();
        if(input.equals("y") || input.equals("Y")){


          calc();

      }else if (input.equals("n") || input.equals("N")){

          System.out.println("Bye ...!!!");
      }



    }

    static void welcomeMsg(String name){

        System.out.println("Welcome "+name+"to the Area and Perimeter Calculator");
    }

    static int Area(int l,int w) {
        return (l * w);
    }
    static int Perimeter(int l,int w){
        return 2*(l+w);
    }
}

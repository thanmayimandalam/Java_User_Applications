package com.assignments;

import javafx.scene.web.PromptData;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Thanmayi on 8/1/2017.
 */
public class GuessNumber {

    public static void main (String args[]){

        System.out.println("Welcome to the Guess the Number Game");
        Scanner SC = new Scanner(System.in);

        int Number = getintWithinRange(SC, "Enter number: ", 1,100);




    }

    public static int getintWithinRange(Scanner SC, String prompt, double min , double max){

        int NumberOfGuess = 0;
        boolean isValid = false;
        Random RD = new Random();
        int Guess = RD.nextInt(50);
        while (isValid == false){
            System.out.print(prompt);
            if (SC.hasNextInt()){

               int Number = SC.nextInt();
                NumberOfGuess++;
                if (Number < min){
                    System.out.println("Enter the Number between 0 -100");
                }else if (Number > max){
                    System.out.println("Enter the Number between 0 -100");
                }else if (Number == Guess){
                    System.out.println("Congzz you WON the GAME");
                    System.out.println("The Number of attempts"+NumberOfGuess+ "you made");
                    isValid = true;
                }else if (Number > Guess){
                    System.out.println("You are way too high");
                }else if (Number < Guess){
                    System.out.println("You are way too low");
                }


            }
            else
            {
                System.out.println("Enter a Valid decimal number");

            }
            SC.nextLine();

        }return NumberOfGuess;



    }
}

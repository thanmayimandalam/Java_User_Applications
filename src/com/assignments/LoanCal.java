package com.assignments;

import org.omg.CORBA.IMP_LIMIT;

import java.util.Scanner;

/**
 * Created by Thanmayi on 7/20/2017.
 */
public class LoanCal {

    static double I;

    public static void main(String args[]) {
        System.out.println("Welcome to the Interest Calculator");
        Scanner scanner = new Scanner(System.in);
        double IM = getDoubleWithinRange(scanner,"Enter Loan Amount:   " , 1 , 1000000 );
        double IR = getDoubleWithinRange(scanner,"Enter interest rate:    " , 1 ,100 );

        System.out.print("Interest Amount:  "+Interest(I,IM,IR));





    }

    public static double Interest(double I, double IM, double IR) {

        IR = (IR * 100);
        I = (IM * IR) / 100;
        return  I;
    }

    public static double getDoubleWithinRange(Scanner scanner,String prompt, double min, double max){

        double Result = 0;
        boolean isValid = false;
        while(isValid == false){

            System.out.print(prompt);

            if(scanner.hasNextDouble()){
                Result = scanner.nextDouble();
                if(Result <= min){
                    System.out.println("Error! Number must be greater than 0.0");
                }
                else if(Result >= max){
                    System.out.println("Error! Number must be less than 1000000.0");
                }
                else{
                    isValid = true;
                }

            }
            else{
                System.out.println("Error! Invalid decimal value. Try again");
            }
            scanner.nextLine();
        }
        return Result;



    }




}



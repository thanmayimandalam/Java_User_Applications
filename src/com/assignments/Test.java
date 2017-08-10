package com.assignments;

/**
 * Created by Thanmayi on 6/23/2017.
 */
public class Test {

    public static void main(String[] args) {


        new Test().f2();
        System.out.println("Thanu");
        System.out.println("chinna");


    }

    void f1(){

        System.out.println("f1()");
    }

    void f2(){

        f1();

        System.out.println("f2()");
    }

}
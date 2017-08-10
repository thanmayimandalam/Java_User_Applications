package com.assignments;

/**
 * Created by Thanmayi on 6/23/2017.
 */
public class Test {

    public static void main(String[] args) {
        // write your code here

        new Test().f2();

    }

    void f1(){

        System.out.println("f1()");
    }

    void f2(){

        f1();

        System.out.println("f2()");
    }

}
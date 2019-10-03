package com.company;

import java.util.Scanner;

public class A {
    int x;


     A() {
        System.out.println("Hello");
    }

    int A_Meth_1() {
        Scanner input = new Scanner(System.in);
        System.out.print("x = ");
        x = input.nextInt();
        return x;
    }

    void A_Meth_2() {
        System.out.println(x + 12);
    }

    public void A_Meth_3() {
        if ( (x % 2) == 1 ) {
            System.out.print("x is an odd number");
        }
        else {
            System.out.print("x is an even number");
        }
    }
}


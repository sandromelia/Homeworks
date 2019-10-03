package com.company;

import java.util.Scanner;

public class B extends A {
    int y;

    int B_Meth_1(){
        Scanner input = new Scanner(System.in);
        System.out.print("y = ");
        y = input.nextInt();
        return y;
    }

    int B_Meth_2(){
        return B_Meth_1() + A_Meth_1();
    }
}

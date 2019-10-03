package com.company;

import java.util.Scanner;

public class C {
    int a;
    int b;
    int c;

    public void C_Meth_1() {
        Scanner input = new Scanner(System.in);
        System.out.print("a = ");
        a = input.nextInt();
        System.out.print("b = ");
        b = input.nextInt();
        System.out.print("c = ");
        c = input.nextInt();
    }

    int C_Meth_2() {
        return a % 10;
    }

    int C_Meth_3() {
        while (b >= 10) {
            b /= 10;
        }
        return b;
    }

    int C_Meth_4() {
        int num = c;
        int sum = 0;
        while (num > 0) {
            sum = sum + num % 10;
            num = num / 10;
        }

        return sum;
    }

    int C_Meth_5() {
        int mul = C_Meth_2() * C_Meth_3();
        System.out.println(mul);
        return mul;
    }

    public void C_Meth_6() {
        System.out.println(C_Meth_3() + C_Meth_5());
    }
}



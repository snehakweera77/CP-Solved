package com.company;

import java.util.Scanner;

public class A501 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int misha = Math.max((3 * a) / 10, a - (a / 250) * c);
        int vasya = Math.max((3 * b) / 10, b - (b / 250) * d);
        if (misha > vasya)
            System.out.println("Misha");
        else if (misha < vasya)
            System.out.println("Vasya");
        else
            System.out.println("Tie");

    }
}

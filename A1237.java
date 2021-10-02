package com.company;

import java.util.Scanner;

public class A1237 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 0;
        int f = 1;
        for (int i = 0; i < n; i++) {
            x = sc.nextInt();
            if (x % 2 == 0)
                System.out.println(x / 2);
            else {
                System.out.println((x + f) / 2);
                f *= -1;
            }
        }

    }
}

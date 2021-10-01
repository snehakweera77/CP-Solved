package com.company;

import java.util.Scanner;

public class A143 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r1 = sc.nextInt();
        int r2 = sc.nextInt();

        int c1 = sc.nextInt();
        int c2 = sc.nextInt();

        int d1 = sc.nextInt();
        int d2 = sc.nextInt();

        for (int a = 1; a < 10; a++) {
            for (int b = 1; b < 10; b++) {
                if (a == b) continue;
                for (int c = 1; c < 10; c++) {
                    if (c == a || c == b) continue;
                    for (int d = 1; d < 10; d++) {
                        if (d == a || d == b || d == c) continue;
                        if (a + b == r1 && c + d == r2 && a + c == c1 && b + d == c2 && a + d == d1 && b+ c == d2) {
                            System.out.println(a + " " + b);
                            System.out.println(c + " " + d);
                            return;
                        }
                    }
                }
            }
        }
        System.out.println("-1");
    }

}

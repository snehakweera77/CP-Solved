package com.company;

import java.util.Scanner;

public class A686 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long x = sc.nextLong();
        long distressed = 0;
        for (int i = 0; i < n; i++) {
            String op = sc.next();
            long d = sc.nextLong();
            if (op.equals("+")) {
                x += d;
            }else if (op.equals("-")) {
                if (x >= d)
                    x -= d;
                else
                    distressed++;
            }
        }
        System.out.println(x + " " + distressed);
    }
}

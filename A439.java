package com.company;

import java.util.Scanner;

public class A439 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int[] t = new int[n];
        int jokes = 0;
        boolean notPoss = false;
        for (int i = 0; i < n; i++) {
            t[i] = sc.nextInt();
            d -= t[i];
            if (d < 0) {
                notPoss = true;
                break;
            }
            if (i != n - 1) {
                d -= 10;
                jokes += 2;
            }
        }
        if (d > 0) {
            jokes += d / 5;
        }
        if (notPoss)
            System.out.println("-1");
        else
            System.out.println(jokes);
    }
}

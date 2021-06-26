package com.company;

import java.util.Scanner;

public class A165 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int total = 0;
        int[] x = new int[n];
        int[] y = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            boolean r = false;
            boolean l = false;
            boolean t = false;
            boolean b = false;
            for (int j = 0; j < n; j++) {
                if (x[j] > x[i] && y[j] == y[i])
                    r = true;
                if (x[j] < x[i] && y[j] == y[i])
                    l = true;
                if (x[j] == x[i] && y[j] > y[i])
                    t = true;
                if (x[j] == x[i] && y[j] < y[i])
                    b = true;
            }
            if (r && l && t && b)
                total++;
        }
        System.out.println(total);
    }
}

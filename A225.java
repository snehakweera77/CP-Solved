package com.company;

import java.util.Scanner;

public class A225 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int top = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int bottom = 7 - top;
        boolean f = false;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            if (a[i] == bottom || a[i] == top || b[i] == top || b[i] == bottom)
                f = true;
        }
        if (f)
            System.out.println("NO");
        else
            System.out.println("YES");

    }
}

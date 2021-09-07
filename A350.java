package com.company;

import java.util.Scanner;

public class A350 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        int v = Integer.MAX_VALUE;
        int p = Integer.MIN_VALUE;
        int c = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            v = Math.min(v, a[i]);
            p = Math.max(p, a[i]);
        }
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
            c = Math.min(c, b[i]);
        }
        if (Math.max(2 * v, p) < c)
            System.out.println(Math.max(2 * v, p));
        else
            System.out.println("-1");
    }
}

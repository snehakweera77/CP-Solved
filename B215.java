package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class B215 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        for (int i = 0; i < n; i++)
            x[i] = sc.nextInt();
        Arrays.sort(x);
        int r1 = x[n - 1];
        int m = sc.nextInt();
        int[] y = new int[m];
        for (int i = 0; i < m; i++)
            y[i] = sc.nextInt();
        Arrays.sort(y);
        int p1 = y[m - 1];
        int k = sc.nextInt();
        int[] z = new int[k];
        for (int i = 0; i < k; i++)
            z[i] = sc.nextInt();
        Arrays.sort(z);
        int p2 = z[0];
        int A = sc.nextInt();
        int B = sc.nextInt();
        double ans = Math.sqrt((B * p1 * 1.0) / (B * p1 *1.0 + A * p2 * 1.0));
        ans *= r1;
        System.out.printf("%.12f", ans);

    }
}

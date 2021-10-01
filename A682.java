package com.company;

import java.util.Scanner;

public class A682 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        long[] a = new long[5];
        long[] b = new long[5];
        for (int i = 1; i <= n; i++)
            a[i % 5]++;
        for (int i = 1; i <= m; i++)
            b[i % 5]++;
        long ans = a[0] * b[0] + a[1] * b[4] + a[2] * b[3] + a[3] * b[2] + a[4] * b[1];
        System.out.println(ans);
    }
}

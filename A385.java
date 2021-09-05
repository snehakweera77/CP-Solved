package com.company;

import java.util.Scanner;

public class A385 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();
        int[]x = new int[n];
        int ans = 0;
        for (int i = 0; i < n; i++)
            x[i] = sc.nextInt();

        for (int i = 0; i < n - 1; i++)
            ans = Math.max(x[i] - x[i + 1] - c, ans);
        System.out.println(ans);
    }
}

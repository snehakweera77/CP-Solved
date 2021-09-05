package com.company;

import java.util.Scanner;

public class A276 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[]f = new int[n];
        int[]t = new int[n];
        int maxJoy = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            f[i] = sc.nextInt();
            t[i] = sc.nextInt();
            if (t[i] > k)
                maxJoy = Math.max(maxJoy, f[i] - t[i] + k);
            else
                maxJoy = Math.max(maxJoy, f[i]);
        }
        System.out.println(maxJoy);
    }
}

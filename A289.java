package com.company;

import java.util.Scanner;

public class A289 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] l = new int[n];
        int[] r = new int[n];
        long p = 0;
        for (int i = 0; i < n; i++) {
            l[i] = sc.nextInt();
            r[i] = sc.nextInt();
            p += (r[i] - l[i] + 1);
        }
        if (p % k == 0)
            System.out.println(0);
        else
            System.out.println((k - (p % k)) % k);

    }
}

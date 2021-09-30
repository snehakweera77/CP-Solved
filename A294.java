package com.company;

import java.util.Scanner;

public class A294 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] birds = new int[n];
        for (int i = 0; i < n; i++)
            birds[i] = sc.nextInt();

        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            int wire = sc.nextInt() - 1;
            int pos = sc.nextInt();
            int left = pos - 1;
            int right = birds[wire] - pos;
            birds[wire] = 0;
            if (wire - 1 >= 0 && left > 0)
                birds[wire - 1] += left;
            if (wire + 1 < n && right > 0)
                birds[wire + 1] += right;
        }
        for (int i : birds)
            System.out.println(i);
    }
}

package com.company;

import java.util.Scanner;

public class A218 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] r = new int[2*n + 1];
        for (int i = 0; i <= 2 * n; i++) {
            r[i] = sc.nextInt();
        }
        for (int i = 0; i <= 2 * n; i++) {
            if (i % 2 == 1 && k > 0 && r[i] > r[i - 1] + 1 && r[i] > r[i +1] + 1) {
                k--;
                System.out.print(r[i] - 1 + " ");
            } else
                System.out.print(r[i] + " ");
        }
    }
}

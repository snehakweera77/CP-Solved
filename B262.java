package com.company;

import java.util.Scanner;

public class B262 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int [] income = new int[n];
        int lastNeg = 0;
        long sum = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            income[i] = a;
        }
        for (int i = 0; i < n; i++) {
            if (income[i] < 0 && k > 0) {
                income[i] *= -1;
                k--;
            }
            sum += income[i];
            min = Math.min(min, income[i]);
        }
        if (k % 2 == 1) {
            sum -= 2 * min;
        }

        System.out.println(sum);
    }
}

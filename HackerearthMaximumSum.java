package com.company;

import java.util.Scanner;

public class HackerearthMaximumSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long sum = 0;
        long ele = 0;
        long negMax = Long.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if (a >= 0) {
                sum += a;
                ele++;
            }
            negMax = Math.max(negMax, a);
        }
        if (ele == 0)
            System.out.println(negMax + " 1");
        else
            System.out.println(sum + " " + ele);
    }
}

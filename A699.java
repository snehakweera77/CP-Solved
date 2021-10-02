package com.company;

import java.util.Scanner;

public class A699 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String symbols = sc.next();
        int[] x = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
        }
        int rl =  symbols.indexOf("RL");
        if (rl == -1)
            System.out.println("-1");
        else {
            int min = Integer.MAX_VALUE;
            while (rl != -1) {
                min = Math.min(min, (x[rl + 1] - x[rl]) / 2);
                rl = symbols.indexOf("RL", rl + 1);
            }
            System.out.println(min);
        }
    }
}

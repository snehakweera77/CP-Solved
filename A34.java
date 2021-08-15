package com.company;

import java.util.Scanner;

public class A34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] height = new int[n];
        for (int i = 0; i < n; i++) {
            height[i] = sc.nextInt();
        }
        int diff = Integer.MAX_VALUE;
        int index1 = 0;
        int index2 = 0;
        for (int i = 0; i < n - 1; i++) {
            if (Math.abs(height[i] - height[i + 1]) < diff) {
                diff = Math.abs(height[i] - height[i + 1]);
                index1 = i;
                index2 = i + 1;
            }
        }
        if (Math.abs(height[0] - height[n - 1]) < diff) {
            diff = Math.abs(height[0] - height[n - 1]);
            index1 = 0;
            index2 = n - 1;
        }
        System.out.println((index1 + 1) + " " + (index2 + 1));
    }
}

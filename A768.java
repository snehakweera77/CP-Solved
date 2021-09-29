package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class A768 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int min = Integer.MAX_VALUE;
        int max = 0;
        for (int i = 0; i <n; i++) {
            a[i] = sc.nextInt();
            min = Math.min(a[i], min);
            max = Math.max(a[i], max);
        }
        int c1 = 0;
        int c2 = 0;
        for (int i : a) {
            if (i == min)
                c1++;
            if (i == max)
                c2++;
        }
        if (min == max)
            System.out.println(0);
        else
            System.out.println(n - c1 - c2);
    }
}

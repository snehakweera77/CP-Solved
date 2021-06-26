package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class B227 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] index = new int[n];
        for (int i = 0; i < n; i++) {
            index[sc.nextInt()] = i + 1;
        }
        int m = sc.nextInt();
        int v = 0;
        int p = 0;
        for (int i = 0; i < m; i++) {
            int q = sc.nextInt();
            v += index[q];
            p += (n - index[q] + 1);
        }
        System.out.println(v + " " + p);
    }
}

package com.company;

import java.util.Scanner;

public class A151 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int l = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int p = sc.nextInt();
        int nl = sc.nextInt();
        int np = sc.nextInt();
        float minSlice = ((float)(c * d)) / (float)n;
        float minDrink = ((float)(k * l)) / (float)(n * nl);
        float minSalt = ((float)(p)) / (float)(np * n);
        System.out.println((int)Math.floor(Math.min(minSlice ,Math.min(minDrink, minSalt))));
    }
}

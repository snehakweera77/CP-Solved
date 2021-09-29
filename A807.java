package com.company;

import java.util.Scanner;

public class A807 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int [] b = new int[n];
        boolean rated = false;
        boolean unrated = false;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            if (a[i] != b[i])
                rated = true;
            if (a[i] > min)
                unrated = true;
            min = a[i];
        }
        if (rated)
            System.out.println("rated");
        else if (unrated)
            System.out.println("unrated");
        else
            System.out.println("maybe");
    }

}

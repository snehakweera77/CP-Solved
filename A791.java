package com.company;

import java.util.Scanner;

public class A791 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int yr = 0;
        while (n <= m) {
            yr++;
            n *= 3;
            m *= 2;
        }
        System.out.println(yr);
    }
}

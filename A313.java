package com.company;

import java.util.Scanner;

public class A313 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n < 0) {
            int sec = n / 100;
            sec = (sec * 10) + n % 10;
            n = Math.max(sec, n / 10);
        }
        System.out.println(n);
    }
}

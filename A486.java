package com.company;

import java.util.Scanner;

public class A486 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long ans = n / 2;
        if (n % 2 != 0)
            ans = (ans + 1) * (-1);
        System.out.println(ans);
    }
}

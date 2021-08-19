package com.company;

import java.util.Scanner;

public class A709 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long b = sc.nextLong();
        long d = sc.nextLong();
        long sum = 0;
        long ans = 0;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if (a <= b)
                sum += a;
            if (sum > d) {
                ans++;
                sum = 0;
            }
        }
        System.out.println(ans);
    }

}

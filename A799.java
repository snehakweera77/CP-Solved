package com.company;

import java.util.Scanner;

public class A799 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int k = sc.nextInt();
        int d = sc.nextInt();
        int curr = 0;
        while (curr <= d) {
            n -= k;
            curr += t;
        }
        if (n > 0)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}

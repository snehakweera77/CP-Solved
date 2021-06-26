package com.company;

import java.util.Scanner;

public class A272 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int total = 0;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            total += sc.nextInt();
        }
        for (int i = 1; i <= 5; ++i)
        {
            if ((total + i) % (n + 1) != 1)
            {
                ans += 1;
            }
        }
        System.out.println(ans);
    }
}

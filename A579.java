package com.company;

import java.util.Scanner;

public class A579 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int ans = 0;
        while (x != 0) {
            if ((x & 1) != 0)
                ans++;
            x = x >> 1;
        }
        System.out.println(ans);
    }
}

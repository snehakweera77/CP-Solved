package com.company;

import java.util.Scanner;

public class A499 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int m = 0;
        int  t =1;
        for (int i = 0; i < n; i++)
        {
            int l = sc.nextInt();
            int r = sc.nextInt();
            t += x * ((l - t) / x);
            m += r - t + 1;
            t = r + 1;
        }
        System.out.println(m);
    }
}

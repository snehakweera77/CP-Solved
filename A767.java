package com.company;

import java.util.Scanner;

public class A767 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n + 1];
        for (int i = 1; i <= n; i++)
            num[i] = sc.nextInt();
        boolean[] vis = new boolean[n + 1];
        int c = n;
        for (int i = 1; i <= n; i++) {
            vis[num[i]] = true;
            while (c >0 && vis[c])
                System.out.print(c-- + " ");
            System.out.println();
        }
    }
}

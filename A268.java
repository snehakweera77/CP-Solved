package com.company;

import java.util.Scanner;

public class A268 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] h = new int[n];
        int[] g = new int[n];
        int ans = 0;
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
            g[i] = sc.nextInt();
            for (int j = 0; j < i; ++j)
            {
                if (h[i] == g[j])
                    ans++;
                if (g[i] == h[j])
                    ans++;
            }
        }
        System.out.print(ans);
    }
}

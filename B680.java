package com.company;

import java.util.Scanner;

public class B680 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int[] t = new int[n];
        for (int i = 0; i < n; i++)
            t[i] = sc.nextInt();
        int ans = 0;
        if (t[a - 1] != 0)
            ans++;
        int i = a - 2;
        int j = a;
        while (i >= 0 && j < n) {
            if (t[i] != 0 && t[j] != 0)
                ans += (t[i] + t[j]);
            i--;
            j++;
        }
        while (i >= 0) {
            ans += t[i];
            i--;
        }
        while (j < n) {
            ans += t[j];
            j++;
        }
        System.out.println(ans);
    }
}

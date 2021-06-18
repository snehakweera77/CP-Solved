package com.company;

import java.util.Scanner;

public class A233 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n %2 == 1) {
            System.out.println("-1");
            return;
        }
        int[] ans = new int[n];
        for (int i = 1; i < n; i+=2) {
            ans[i - 1] = 1 + i;
            ans[i] = i;
        }

        for (int i = 0; i < n; i++)
            System.out.print(ans[i] + " ");
    }
}

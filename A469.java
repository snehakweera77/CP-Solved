package com.company;

import java.util.Scanner;

public class A469 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        boolean[] arr = new boolean[n];
        for (int i = 0; i < p; i++) {
            int j = sc.nextInt() - 1;
            arr[j] = true;
        }
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            int j = sc.nextInt() - 1;
            arr[j] = true;
        }

        boolean flag = true;
        for (int i = 0; i < n; i++) {
            if (!arr[i]) {
                flag = false;
                break;
            }
        }
        if (flag)
            System.out.println("I become the guy.");
        else
            System.out.println("Oh, my keyboard!");
    }
}

package com.company;

import java.util.Scanner;

public class A567 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int maxI = 0;
        int minI = 0;
        for (int i = 0; i < n; i++) {
            int min, max;
            if (i == 0) {
                minI = Math.abs(arr[i] - arr[i + 1]);
                maxI = Math.abs(arr[i] - arr[n - 1]);
            } else if (i == n - 1) {
                minI = Math.abs(arr[i] - arr[i - 1]);
                maxI = Math.abs(arr[i] - arr[0]);
            } else {
                minI = Math.min(Math.abs(arr[i] - arr[i - 1]), Math.abs(arr[i] - arr[i + 1]));
                maxI = Math.max(Math.abs(arr[i] - arr[0]), Math.abs(arr[i] - arr[n - 1]));
            }

            System.out.println(minI + " " + maxI);
        }
    }
}

package com.company;

import java.util.Scanner;

public class CodeChefBlondie {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            long sum = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i] != -1) {
                    sum += arr[i];
                    System.out.print(arr[i] + " ");
                } else {
                    long avg = sum / i;
                    System.out.print(avg + " ");
                    sum += avg;
                }
            }
            System.out.println();
        }
    }
}

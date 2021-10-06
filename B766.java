package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class B766 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        Arrays.sort(arr);
        for (int i = 0; i < n - 2; i++) {
            if (arr[i] > 0) {
                if (arr[i] + arr[i + 1] > arr[i + 2]) {
                    System.out.println("YES");
                    return;
                }
            }
        }
        System.out.println("NO");
    }
}

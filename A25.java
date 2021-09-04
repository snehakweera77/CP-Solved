package com.company;

import java.util.Scanner;

public class A25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int cEven = 0;
        int cOdd = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] % 2 == 0)
                cEven++;
            else
                cOdd++;
        }
        boolean even = cEven > cOdd;
        for (int i = 0; i < n; i++) {
            if (even && arr[i] % 2 == 1) {
                System.out.println(i + 1);
                break;
            }
            else if (!even && arr[i] % 2 == 0) {
                System.out.println(i + 1);
                break;
            }
        }
        }
}

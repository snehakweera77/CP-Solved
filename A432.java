package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class A432 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        int min = 5 - k;
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        Arrays.sort(arr);
        int count = 0;
        for (int i = 2; i < n; i += 3) {
            if (arr[i] > min)
                break;
            count++;
        }
        System.out.println(count);
    }
}

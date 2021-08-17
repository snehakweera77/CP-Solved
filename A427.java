package com.company;

import java.util.Scanner;

public class A427 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int police = 0;
        int untreated = 0;
        for (int i = 0; i < n ; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] > 0)
                police += arr[i];
            else {
                if (police == 0)
                    untreated++;
                else
                    police -= 1;
            }
        }
        System.out.println(untreated);
    }
}

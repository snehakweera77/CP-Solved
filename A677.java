package com.company;

import java.util.Scanner;

public class A677 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int h = sc.nextInt();
            int[] arr = new int[n];
            int len = 0;
            for (int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
                if (arr[i] <= h)
                    len++;
            }
            len += (n - len) * 2;
            System.out.println(len);
        }
}

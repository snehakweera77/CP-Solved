package com.company;

import java.util.Scanner;

public class A248 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int left = 0;
        int right = 0;
        for (int i = 0; i < n; i++) {
            left += sc.nextInt();
            right += sc.nextInt();
        }
        int time = Math.min(left, n - left) + Math.min(right, n - right);
        System.out.println(time);
    }
}

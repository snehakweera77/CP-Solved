package com.company;

import java.util.Scanner;

public class B200 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        float percent = 0;
        for (int i = 0; i < n; i++) {
            percent += sc.nextInt();
        }
        System.out.println((percent / (100.0 * n)) * 100);
    }
}

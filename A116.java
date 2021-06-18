package com.company;

import java.util.Scanner;

public class A116 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int people = 0;
        int minCapacity = 0;
        for (int i = 0; i < n; i++) {
            people -= sc.nextInt();
            people += sc.nextInt();
            minCapacity = Math.max(minCapacity, people);
        }
        System.out.println(minCapacity);
    }
}

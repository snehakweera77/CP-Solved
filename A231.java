package com.company;

import java.util.Scanner;

public class A231 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            sum += sc.nextInt();
            sum += sc.nextInt();
            sum += sc.nextInt();
            count += sum >= 2 ? 1 : 0;
        }
        System.out.println(count);
    }
}

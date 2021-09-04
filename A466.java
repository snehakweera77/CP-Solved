package com.company;

import java.util.Scanner;

public class A466 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int special = (n / m) * b;
        if (n % m != 0) {
            special += Math.min(b, (n % m) * a);
        }
        System.out.println(Math.min(n * a, special));
    }
}

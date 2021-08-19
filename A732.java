package com.company;

import java.util.Scanner;

public class A732 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int r = sc.nextInt();
        for (int i = 1; i <= 10 ; i++) {
            int temp = (i * k) % 10;
            if (temp == 0 || temp == r) {
                System.out.println(i);
                return;
            }
        }
    }
}

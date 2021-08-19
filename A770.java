package com.company;

import java.util.Scanner;

public class A770 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int i = 0;
        while (n > 0) {
            int t = k;
            while (t-- > 0 && n > 0) {
                System.out.print((char) ('a' + i));
                i++;
                n--;
            }
            i = 0;
        }

    }
}

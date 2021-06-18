package com.company;

import java.util.Scanner;

public class A155 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int min = sc.nextInt();
         int max = min;
         int cool = 0;
        for (int i = 1; i < n; i++) {
            int j = sc.nextInt();
            if (j > max) {
                max = j;
                cool++;
            }
            else if (j < min) {
                min = j;
                cool++;
            }
        }
        System.out.println(cool);
    }
}

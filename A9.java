package com.company;

import java.util.Scanner;

public class A9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        int w = sc.nextInt();
        int max = Math.max(y, w);
        int rem = 6 - max;
        int num = 0;
        int dem = 6;
        if (rem == 0) {
            num = 1;
        } else if (rem == 1) {
            num = 1;
            dem = 3;
        } else if (rem == 2) {
            num = 1;
            dem = 2;
        } else if (rem == 3) {
            num = 2;
            dem = 3;
        } else if (rem == 4) {
            num = 5;
        } else if (rem == 5) {
            num = 1;
            dem = 1;
        } else if (num == 6) {
            num = 1;
            dem = 1;
        }
        System.out.println(num + "/" + dem);

    }
}

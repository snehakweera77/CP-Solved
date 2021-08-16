package com.company;

import java.util.Scanner;

public class A208 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        boolean starting = true;
        int len = s.length();
        for (int i = 0; i < len; i++) {
            if (i < len - 2 && s.charAt(i) == 'W' && s.charAt(i + 1) == 'U' && s.charAt(i + 2) == 'B') {
                i += 2;
                if (!starting)
                    System.out.print(" ");
            }
            else {
                System.out.print(s.charAt(i));
                starting = false;
            }
        }
    }
}

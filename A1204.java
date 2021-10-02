package com.company;

import java.util.Scanner;

public class A1204 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int l = s.length();
        int i = s.lastIndexOf('1');
        if (s.equals("0")) {
            System.out.println(0);
            return;
        }
        if (i == 0)
            l--;
        System.out.println((l / 2) + (l % 2));
    }
}

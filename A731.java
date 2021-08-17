package com.company;

import java.util.Scanner;

public class A731 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char p = 'a';
        int rot = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            rot += Math.min(Math.abs(c - p), 26 - Math.abs(c - p));
            p = c;
        }
        System.out.println(rot);
    }
}

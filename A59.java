package com.company;

import java.util.Scanner;

public class A59 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] ch = s.toCharArray();
        float smallcase = 0;
        for (char c : ch) {
            if (c - 'a' >= 0)
                smallcase++;
        }
        if (smallcase >= s.length() / 2.0) {
            for (int i = 0; i < ch.length; i++) {
                if (ch[i] - 'a' < 0)
                    ch[i] += 32;
            }
        }
        else {
            for (int i = 0; i < ch.length; i++) {
                if (ch[i] - 'a' >= 0)
                    ch[i] -= 32;
            }
        }
        System.out.println(String.valueOf(ch));
    }



}

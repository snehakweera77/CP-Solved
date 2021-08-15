package com.company;

import java.io.IOException;
import java.util.Scanner;

public class A41 {
    public static boolean solve(String s, String t) {
        if (s.length() != t.length())
            return false;
        int len = s.length();
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) != t.charAt(len - i - 1))
                return false;
        }
        return true;
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        if (solve(s, t))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}

package com.company;

import java.util.Scanner;

public class A71 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            int len = s.length();
            if (len > 10) {
                String printLen = String.valueOf(len - 2);
                String out = s.charAt(0) + printLen + s.charAt(len - 1);
                System.out.println(out);
            }
            else
                System.out.println(s);
        }

    }
}

package com.company;

import java.util.Scanner;

public class A382 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        int i = a.indexOf('|');
        StringBuilder left = new StringBuilder(a.substring(0, i));
        StringBuilder right = new StringBuilder(a.substring(i + 1));
        for (int j = 0; j < b.length(); j++) {
            if (left.length() < right.length())
                left.append(b.charAt(j));
            else
                right.append(b.charAt(j));
        }
        if (left.length() == right.length())
            System.out.println(left.toString() + "|" + right.toString());
        else
            System.out.println("Impossible");

    }
}

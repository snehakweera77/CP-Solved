package com.company;

import java.util.Scanner;

public class A766 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        if (a.equals(b))
            System.out.println("-1");
        else
            System.out.println(Math.max(a.length(), b.length()));
    }
}

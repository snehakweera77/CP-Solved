package com.company;

import java.util.Scanner;

public class A483 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long l = sc.nextLong();
        long r = sc.nextLong();
        if (l % 2 != 0) l++;
        if (l + 2 > r) System.out.println("-1");
        else
            System.out.println(l + " " + (l + 1) + " " + (l + 2));
    }
}

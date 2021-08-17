package com.company;

import java.util.Scanner;

public class A344 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int prev = -1;
        int count = 1;
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            int curr = (int)s.charAt(0);
            if (i != 0) {
                if (prev == curr)
                    count++;
            }
            prev = (int)s.charAt(1);
        }
        System.out.println(count);
    }
}

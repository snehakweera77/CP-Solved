package com.company;

import java.util.Scanner;

public class A514 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        int mult = 10;
        StringBuilder ans = new StringBuilder();
        while (x > 0) {
            long t = x % 10;
            x = x / 10;
            if (x == 0 && t == 9) {
                ans.append(t);
            }
            else if (9 - t < t)
                ans.append(9 - t);
            else
                ans.append(t);
        }

        System.out.println(ans.reverse().toString());
    }
}

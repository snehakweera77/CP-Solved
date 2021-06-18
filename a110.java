package com.company;

import java.util.Scanner;

public class a110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long numOfLuckyDigits = 0;
        while (n > 0) {
            long i = n % 10;
            if (i == 4 || i == 7)
                numOfLuckyDigits++;
            n /= 10;
        }
        if (numOfLuckyDigits == 7 || numOfLuckyDigits == 4)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}

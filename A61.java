package com.company;

import java.util.Scanner;

public class A61 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num1 = sc.nextLine();
        String num2 = sc.nextLine();
        int l = num1.length();
        char[] ans = new char[l];
        for (int i = 0; i < l; i++) {
            if (num1.charAt(i) == num2.charAt(i))
                ans[i] = '0';
            else
                ans[i] = '1';
        }
        System.out.println(String.valueOf(ans));
    }
}

package com.company;

import java.util.Scanner;

public class A58 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] hello = {'h', 'e', 'l', 'l', 'o'};
        int j = 0;
        boolean flag = false;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == hello[j]) {
                j++;
                if (j == hello.length) {
                    flag = true;
                    break;
                }
            }
        }
        if (flag)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}

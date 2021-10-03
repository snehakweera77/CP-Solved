package com.company;

import java.util.Scanner;

public class B102 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int cnt = 0;
        while (s.length() > 1) {
            cnt++;
            int temp = 0;
            for (int i = 0; i < s.length(); i++) {
                temp += s.charAt(i) - '0';
            }
            s = String.valueOf(temp);
        }
        System.out.println(cnt);
    }
}

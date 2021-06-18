package com.company;

import java.util.Scanner;

public class A281 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] ch = s.toCharArray();
        if (ch[0] - 'a' >= 0)
            ch[0] -= 32;
        System.out.println(String.valueOf(ch));
    }
}

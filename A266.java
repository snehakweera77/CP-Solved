package com.company;

import java.util.Scanner;

public class A266 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.next();
        char[] ch = s.toCharArray();
        int i = 0;
        int count = 0;
        for (int j = 1; j < ch.length; j++) {
            if (ch[i] == ch[j])
                count++;
            else
                i = j;
        }
        System.out.println(count);
    }
}

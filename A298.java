package com.company;

import java.util.Scanner;

public class A298 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int fi = 0;
        int li = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) != '.') {
                fi = i;
                break;
            }
        }
        for (int i = n - 1; i >= 0; i--) {
            if (s.charAt(i) != '.') {
                li = i;
                break;
            }
        }
        if (s.charAt(fi) == 'R' && s.charAt(li) == 'R')
            System.out.println((fi + 1) + " " + (li +2));
        else if (s.charAt(fi) == 'L' && s.charAt(li) == 'L')
            System.out.println((li + 1) + " " + (fi));
        else {
            li = s.indexOf('L');
            System.out.println((fi + 1) + " " + (li));
        }

    }
}

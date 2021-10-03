package com.company;

import java.util.Scanner;

public class B47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String c = sc.next();
        int[] m = new int[3];
        if (a.charAt(1) == '>')
            m[a.charAt(0) - 'A']++;
        else
            m[a.charAt(2) - 'A']++;
        if (b.charAt(1) == '>')
            m[b.charAt(0) - 'A']++;
        else
            m[b.charAt(2) - 'A']++;
        if (c.charAt(1) == '>')
            m[c.charAt(0) - 'A']++;
        else
            m[c.charAt(2) - 'A']++;

        if (m[0] == 1 && m[1] == 1 && m[2] == 1)
            System.out.println("Impossible");
        else {
            if (m[0] == 0)
                System.out.print('A');
            else if (m[1] == 0)
                System.out.print('B');
            else if (m[2] == 0)
                System.out.print('C');
            if (m[0] == 1)
                System.out.print('A');
            else if (m[1] == 1)
                System.out.print('B');
            else if (m[2] == 1)
                System.out.print('C');
            if (m[0] == 2)
                System.out.print('A');
            else if (m[1] == 2)
                System.out.print('B');
            else if (m[2] == 2)
                System.out.print('C');
        }
    }
}

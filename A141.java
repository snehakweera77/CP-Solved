package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class A141 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] guest = sc.nextLine().toCharArray();
        char[] host = sc.nextLine().toCharArray();
        char[] s = sc.next().toCharArray();

        if (guest.length + host.length != s.length) {
            System.out.println("NO");
            return;
        }

        Arrays.sort(guest);
        Arrays.sort(host);
        Arrays.sort(s);

        int i = 0;
        int j = 0;
        for (char c : s) {
            if (i < guest.length && guest[i] == c)
                i++;
            else if (j < host.length && host[j] == c)
                j++;
            else {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}

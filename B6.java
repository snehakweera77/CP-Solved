package com.company;

import java.util.HashSet;
import java.util.Scanner;

public class B6 {
    public static HashSet<Character> set = new HashSet<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String c = sc.next();
        String[] office = new String[n];
        int[] ind = new int[2];
        boolean dot = false;
        for (int i = 0; i < n; i++) {
            office[i] = sc.next();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (office[i].charAt(j) == c.charAt(0)) {
                    if(i != 0 && office[i - 1].charAt(j) != c.charAt(0) && office[i - 1].charAt(j) != '.')
                        set.add(office[i - 1].charAt(j));
                    if(j != 0 && office[i].charAt(j - 1) != c.charAt(0) && office[i].charAt(j - 1) != '.')
                        set.add(office[i].charAt(j - 1));
                    if(i != n - 1 && office[i +1].charAt(j) != c.charAt(0) && office[i + 1].charAt(j) != '.')
                        set.add(office[i + 1].charAt(j));
                    if(j != m - 1 && office[i].charAt(j + 1) != c.charAt(0) && office[i].charAt(j + 1) != '.')
                        set.add(office[i].charAt(j + 1));
                }
            }
        }
        System.out.println(set.size());
    }

}

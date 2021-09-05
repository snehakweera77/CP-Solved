package com.company;

import java.util.HashSet;
import java.util.Scanner;

public class A330 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        HashSet<Integer> a = new HashSet<>();
        HashSet<Integer> b = new HashSet<>();

        sc.nextLine();
        for (int i = 0; i < r; i++) {
            String s = sc.next();
            for (int j = 0; j < c; j++){
                if (s.charAt(j) == 'S') {
                    a.add(i);
                    b.add(j);
                }
            }
        }
        System.out.println(r * c - a.size() * b.size());
    }
}

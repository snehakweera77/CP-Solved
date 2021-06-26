package com.company;

import java.util.HashSet;
import java.util.Scanner;

public class A228 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < 4; i++) {
            set.add(sc.nextInt());
        }
        System.out.println(4 - set.size());
    }
}

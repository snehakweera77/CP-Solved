package com.company;

import java.util.HashSet;
import java.util.Scanner;

public class B400 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String[] arr = new String[n];
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < n; i++) {
            arr[i] = sc.next();
            int s = arr[i].indexOf('S');
            int g = arr[i].indexOf('G');
            if (s < g) {
                System.out.println(-1);
                return;
            }
            set.add(s - g);
        }
        System.out.println(set.size());

    }
}

package com.company;

import java.util.HashSet;
import java.util.Scanner;

class contest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            sc.nextLine();
            String[] s = new String[n];
            int total = (int) Math.pow(2, n);
            HashSet<Integer> set = new HashSet<>();
            for (int i = 0; i < n; i++) {
                s[i] = sc.next();
                int num = Integer.parseInt(s[i], 2);
                set.add(num);
            }
            for (int i = 0; i < total; i++) {
                if (!set.contains(i)) {
                    System.out.println(String.format("%" + n + "s", Integer.toBinaryString(i)).replaceAll(" ", "0"));
                    break;
                }
            }
        }
    }
}

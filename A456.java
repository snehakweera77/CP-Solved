package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class A456 {
    static class Pair implements Comparable<Pair>{
        int a, b;
        Pair(int a, int b) {
            this.a = a;
            this.b = b;
        }

        @Override
        public int compareTo(Pair o) {
            return this.a - o.a;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Pair[] p = new Pair[n];

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            p[i] = new Pair(a, b);
        }
        Arrays.sort(p);
        boolean flag = false;
        for (int i = 1; i < n; i++) {
            if (p[i - 1].b > p[i].b) {
                flag = true;
                break;
            }
        }
        if (flag)
            System.out.println("Happy Alex");
        else
            System.out.println("Poor Alex");
    }
}

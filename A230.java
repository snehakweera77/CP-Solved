package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class A230 {
    static class Pair implements Comparable<Pair>{
        int x;
        int y;
        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Pair a) {
            return this.x - a.x;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int n = sc.nextInt();
        Pair[] p = new Pair[n];
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            p[i] = new Pair(x, y);
        }
        Arrays.sort(p);
        boolean flag = false;
        for (int i = 0; i < n; i++) {
            if (p[i].x < s) {
                s += p[i].y;
            } else {
                flag = true;
                break;
            }
        }
        if (flag)
            System.out.println("NO");
        else
            System.out.println("YES");
    }
}

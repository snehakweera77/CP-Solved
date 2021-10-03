package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class B16 {
    public static class Match implements Comparable<Match>{
        int matches;
        long matchBoxes;
        Match(long matchBoxes, int matches) {
            this.matches = matches;
            this.matchBoxes = matchBoxes;
        }


        @Override
        public int compareTo(Match o) {
            if (o.matches > this.matches) return 1;
            else return -1;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int m = sc.nextInt();
        Match[] t = new Match[m];

        for (int i = 0; i < m; i++) {
            long a = sc.nextLong();
            int b = sc.nextInt();
            Match x = new Match(a, b);
            t[i] = x;
        }
        Arrays.sort(t);
        long ma = 0;
        for (int i = 0; i < m; i++) {
            if (n >= t[i].matchBoxes) {
                n -= t[i].matchBoxes;
                ma += (t[i].matchBoxes * t[i].matches);
            } else {
                ma += (n * t[i].matches);
                n = 0;
            }
        }
        System.out.println(ma);
    }
}

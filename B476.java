package com.company;

import java.util.Scanner;

public class B476 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String r = sc.next();
        int[] ch = new int[3];
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '+')
                ch[0]++;
            else
                ch[0]--;
        }
        for (int i = 0; i < s.length(); i++) {
            if (r.charAt(i) == '+')
                ch[1]++;
            else if (r.charAt(i) == '-')
                ch[1]--;
            else
                ch[2]++;
        }
        int dis = ch[0] - ch[1];
        double ans = 0;
        if ((dis + ch[2]) % 2 != 0 || ch[2] < Math.abs(dis))
            ans = 0;
        else {
            int m = (ch[2] + Math.abs(dis)) / 2;
            int c = 1;
            for (int i = 0; i < m; i++)
                c *= ch[2] - i;
            for (int i = 2; i <= m; i++)
                c /= i;
            ans =  (c /(double) (1 << ch[2]));
        }
        System.out.printf("%.12f", ans);
    }
}

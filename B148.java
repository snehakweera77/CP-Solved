package com.company;

import java.util.Scanner;

public class B148 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double vp = sc.nextDouble();
        double vd = sc.nextDouble();
        double t = sc.nextDouble();
        double f = sc.nextDouble();
        double c = sc.nextDouble();
        double dis = 0;
        int ans = 0;
        if (vp < vd) {
            dis = (vd * vp * t) / (vd - vp);
            while (dis < c) {
                dis = vd * (dis + vp * (f + dis / vd)) / (vd - vp);
                ++ans;
            }
        }
        System.out.println(ans);
    }
}

package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class A490 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] t = new int[n];
        int one = 0;
        int two = 0;
        int three = 0;
        ArrayList<Integer> oneArr = new ArrayList<>();
        ArrayList<Integer> twoArr = new ArrayList<>();
        ArrayList<Integer> threeArr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            t[i] = sc.nextInt();
            if (t[i] == 1) {
                one++;
                oneArr.add(i + 1);
            } else if (t[i] == 2) {
                two++;
                twoArr.add(i + 1);
            } else {
                three++;
                threeArr.add(i + 1);
            }
        }
        int team = Math.min(one, Math.min(two, three));
        System.out.println(team);
        if (team != 0) {
            for (int i = 0; i < team; i++) {
                System.out.println(oneArr.get(i) + " " + twoArr.get(i) + " " + threeArr.get(i));
            }
        }
    }
}

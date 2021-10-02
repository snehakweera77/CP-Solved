package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class A296 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        if (n == 1) {
            System.out.println("YES");
            return;
        }
        Arrays.sort(a);
        ArrayList<Integer> al = new ArrayList<>();
        int cnt = 1;
        for (int i = 1; i < n; i++) {
            if (a[i] != a[i - 1]) {
                al.add(cnt);
                cnt = 0;
            }
            cnt++;
        }
        al.add(cnt);
        Collections.sort(al);
        if (al.get(al.size() - 1) > (n + 1) / 2)
            System.out.println("NO");
        else
            System.out.println("YES");
    }
}

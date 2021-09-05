package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class A496 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        int diff = 0;
        for (int i = 0; i < n; i++) {
            a.add(sc.nextInt());
        }
        if (n == 3)
            System.out.println(a.get(2) - a.get(0));
        else {
            int ind = 0;
            int indDiff = Integer.MAX_VALUE;
            for (int i = 1; i < n - 1; i++) {
                if (a.get(i + 1) - a.get(i - 1) < indDiff) {
                    indDiff = a.get(i + 1) - a.get(i - 1);
                    ind = i;
                }
            }
            a.remove(ind);
            for (int i = 1; i < n - 1; i++)
                diff = Math.max(diff, a.get(i) - a.get(i - 1));
            System.out.println(diff);
        }
    }
}

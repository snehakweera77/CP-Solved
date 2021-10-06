package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class B79 {
    public static class Waste implements Comparable<Waste> {
        int a;
        int b;
        public Waste(int a, int b) {
            this.a = a;
            this.b = b;
        }


        @Override
        public int compareTo(Waste o) {
            if (this.a < o.a)
                return 1;
            else if (this.a == o.a && this.b <= o.b)
                return 1;
            return -1;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int t = sc.nextInt();
        ArrayList<Waste> w = new ArrayList<>();
        String[] fruits = { "Grapes", "Carrots", "Kiwis"};
        for (int i = 0; i < k; i++) {
            int r = sc.nextInt();
            int c = sc.nextInt();
            Waste wa = new Waste(r, c);
            w.add(wa);
        }
        Collections.sort(w);

       /* for (int i = 0; i < w.size(); i++) {
            System.out.println(w.get(i).a + " " + w.get(i).b);
        }*/
        for (int i = 0; i < t; i++) {
            int r = sc.nextInt();
            int c = sc.nextInt();
            int cell = (r - 1) * (m) + c;
            boolean waste = false;
            for (int j= 0; j < w.size(); j++) {
                if (w.get(j).a == r && w.get(j).b == c) {
                    waste = true;
                    break;
                }
                if (w.get(j).a < r)
                    cell--;
                else if (w.get(j).a == r && w.get(j).b < c)
                    cell--;
            }
            if (waste)
                System.out.println("Waste");
            else
                System.out.println(fruits[cell % 3]);
        }

    }
}

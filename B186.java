package com.company;

import java.util.*;

public class B186 {
    static class Pair  {
        int index;
        double height;
        public Pair(int index, double height) {
            this.index = index;
            this.height = height;
        }
    }
    static class Sort implements Comparator<Pair> {
        @Override
        public int compare(Pair o1, Pair o2) {
            if (o1.height == o2.height)
                return o1.index - o2.index;
            else if (o1.height > o2.height)
                return -1;
            else
                return 1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t1 = sc.nextInt();
        int t2 = sc.nextInt();
        int k = sc.nextInt();
        ArrayList<Pair> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            double height = (a * t1) * (100.00 - k) / 100.00;
            height += b * t2;
            double height2 = (b * t1) * (100.00 - k) / 100.00;
            height2 += a * t2;
            Pair p = new Pair(i + 1, Math.max(height, height2));
            ans.add(p);
        }
        Collections.sort(ans, new Sort());
        for (Pair p : ans) {
            System.out.print(p.index + " ");
            System.out.format("%.2f", p.height);
            System.out.println();
        }
    }

}

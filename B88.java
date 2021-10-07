package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class B88 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int x = sc.nextInt();
        char[][] keyboard = new char[n][m];
        int[] alpha = new int[26];
        ArrayList<ArrayList<Integer>> s = new ArrayList<>();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            char[] st = sc.nextLine().toCharArray();
            for (int j = 0; j < m; j++) {
                keyboard[i][j] = st[j];
                if (keyboard[i][j] == 'S') {
                    ArrayList<Integer> a = new ArrayList<>();
                    a.add(i + 1);
                    a.add(j + 1);
                    s.add(a);
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (keyboard[i][j] == 'S')
                    continue;
                int t = Integer.MAX_VALUE;
                for (int k = 0; k < s.size(); k++) {
                    int a = s.get(k).get(0) - (i + 1);
                    int b = s.get(k).get(1) - (j + 1);
                    int f = (int)Math.ceil(Math.sqrt(a * a + b * b));
                    t = Math.min(f, t);
                }
                if (alpha[keyboard[i][j] - 'a'] == 0)
                    alpha[keyboard[i][j] - 'a'] = t;
                else if (alpha[keyboard[i][j] - 'a'] > t) {
                    alpha[keyboard[i][j] - 'a'] = t;
                }
            }
        }

        int q = sc.nextInt();
        char [] text = sc.next().toCharArray();
        int count = 0;
        for (int i = 0; i < q; i++)  {
            if (text[i] < 97) {
                if (s.size() == 0 || alpha[text[i] - 'A'] == 0) {
                    count = -1;
                    break;
                } else if (alpha[text[i] - 'A'] > x)
                    count++;
            } else if (alpha[text[i] - 'a'] == 0) {
                count = -1;
                break;
            }
        }
        System.out.println(count);
    }
}

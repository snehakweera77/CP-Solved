package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class B385 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int len = s.length();
        int x = 1;
        int y= 0;
        long ans = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i + 3 < len; i++) {
            if (s.charAt(i) == 'b' && s.charAt(i + 1) == 'e' && s.charAt(i + 2) == 'a' && s.charAt(i + 3) == 'r')
                list.add(i + 1);
        }
        for (int i = 0; i < list.size(); i++) {
            y = len - list.get(i) - 2;
            if (i != 0)
                x = list.get(i - 1) + 1;
            x = list.get(i) + 1 - x;
            ans += x * y;
        }

        System.out.println(ans);
    }
}

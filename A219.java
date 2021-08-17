package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class A219 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        String s = sc.next();
        HashMap<Character, Integer> map = new HashMap<>();
        ArrayList<Character> cList = new ArrayList<>();
        StringBuilder st = new StringBuilder();
        boolean poss = true;
        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i)))
                cList.add(s.charAt(i));
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (char c : cList) {
            if (map.get(c) % k != 0) {
                poss = false;
                break;
            }
            int a = map.get(c) / k;
            while (a-- > 0)
                st.append(c);
        }
        if (!poss)
            System.out.println("-1");
        else {
            String ans = st.toString();
            while (k-- > 0) {
                System.out.print(ans);
            }
        }
    }
}

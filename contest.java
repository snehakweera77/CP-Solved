package com.company;

import java.util.*;

class contest {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t = sc.nextInt();
        while(t-- > 0){
            solve();
        }
    }

    private static void solve() {
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.next();
        Stack<Integer> a = new Stack<>();
        Stack<Integer> b = new Stack<>();
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'a') {
                if (!b.isEmpty()) {
                    System.out.println(b.peek() + " " + (i + 1));
                    return;
                }
                else
                    a.push(i + 1);
            } else {
                if (!a.isEmpty()) {
                    System.out.println(a.peek() + " " + (i + 1));
                    return;
                }
                else
                    b.push(i + 1);
            }
        }
        System.out.println("-1 -1");
    }
}

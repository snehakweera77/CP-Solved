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
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int a = 0;
        int b = 0;
        int c = 0;

        if (b == (a + c))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}

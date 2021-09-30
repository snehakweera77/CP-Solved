package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class A785 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n];
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Tetrahedron", 4);
        map.put("Cube", 6);
        map.put("Octahedron", 8);
        map.put("Dodecahedron", 12);
        map.put("Icosahedron", 20);
        long ans = 0;
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
            ans += map.get(s[i]);
        }
        System.out.println(ans);
    }
}

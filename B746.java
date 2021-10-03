package com.company;

import java.util.Scanner;

public class B746 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        StringBuilder sb = new StringBuilder();
        boolean end = n % 2 != 0;
        for (int i = 0; i < n; i++) {
            if (end)
                sb.append(s.charAt(i));
            else
                sb.insert(0, s.charAt(i));
            end = !end;
        }
        System.out.println(sb.toString());
    }
}

package com.company;

import java.util.Scanner;

public class A262 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        sc.nextLine();
        int count = 0;
        while (n-- > 0) {
            int lucky = 0;
            String s = sc.next();
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '4' || s.charAt(i) == '7')
                    lucky++;
            }
            if (lucky <= x)
                count++;
        }
        System.out.println(count);
    }
}

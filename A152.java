package com.company;

import java.util.Scanner;

public class A152 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String[] marks = new String[n];
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            marks[i] = sc.next();
        }
        boolean[] successful = new boolean[n];
        for (int subject = 0; subject < m; ++subject)
        {
            char best = '0';
            for (int i = 0; i < n; ++i)
            {
                if (marks[i].charAt(subject) > best)
                {
                    best = marks[i].charAt(subject);
                }
            }
            for (int i = 0; i < n; ++i)
            {
                if (marks[i].charAt(subject) == best)
                {
                    successful[i] = true;
                }
            }
        }
        int count = 0;
        for (boolean i : successful) {
            if (i) count++;
        }

        System.out.println(count);
    }
}

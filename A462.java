package com.company;

import java.util.Scanner;

public class A462 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.next();
        boolean flag = false;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                char c = arr[i].charAt(j);
                    if (j + 1 < n && arr[i].charAt(j + 1) == 'o')
                        count++;
                    if (j - 1 >= 0 && arr[i].charAt(j - 1) == 'o')
                        count++;
                    if (i + 1 < n && arr[i + 1].charAt(j) == 'o')
                        count++;
                    if (i - 1 >= 0 && arr[i - 1].charAt(j) == 'o')
                        count++;
                    if (count % 2 == 1)
                        flag = true;

            }
        }
        if (flag)
            System.out.println("NO");
        else
            System.out.println("YES");
    }
}

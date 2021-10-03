package com.company;

import java.util.Scanner;

public class B78 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] colors = {'R', 'O', 'Y', 'G', 'B', 'I', 'V'};
        char[] ans = new char[n];
        int i = 0;
        int r = n - 1;
        int j = 0;
        while (i < n / 2) {
            ans[i] = colors[j % 7];
            j++;
            ans[n - i - 1] = colors[j % 7];
            i++;
            j++;
        }
        if (n % 2 == 1)
            ans[i] = colors[j % 7];
        for (char c : ans)
            System.out.print(c);
    }
}

package com.company;
import java.util.Scanner;

public class A214 {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int ans = 0;
        for (int b = 0; b <= n; b++) {
            for (int a = 0; a <= m; a++) {
                if (((a * a) + b) == n && ((b * b) + a) == m)
                    ans++;
            }
        }
        System.out.println(ans);
    }
}

package com.company;

import java.io.IOException;
import java.util.Scanner;

public class A43 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[2];
        String s = "";
        String t = "";
        for (int i = 0; i < n; i++) {
            String a = sc.next();
            if (s.equals("")) {
                s = a;
                arr[0]++;
            }
            else if (s.equals(a))
                arr[0]++;
            else {
                if (t.equals(""))
                    t = a;
                arr[1]++;
            }
        }
        if (arr[0] > arr[1])
            System.out.println(s);
        else
            System.out.println(t);
    }
}

package com.company;

import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;

public class A265 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        int pos = 0;
        char c = s.charAt(pos);
        for (int i = 0; i < t.length() && pos < s.length(); i++) {
            if (c == t.charAt(i)){
                pos++;
                c = s.charAt(pos);
            }
        }
        System.out.println(pos + 1);
    }
}

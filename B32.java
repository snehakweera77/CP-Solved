package com.company;
import java.util.Scanner;

public class B32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] ch = s.toCharArray();
        int l = s.length();
        StringBuilder  out = new StringBuilder();
        for (int i = 0; i < l; i++) {
            if (ch[i] == '.') {
                out.append("0");
            }
            else if (ch[i] == '-' && ch[i + 1] == '.') {
                out.append("1");
                i++;
            }
            else {
                out.append("2");
                i++;
            }
        }
        System.out.println(out.toString());
    }
}

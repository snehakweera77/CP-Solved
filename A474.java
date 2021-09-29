package com.company;

import java.util.HashSet;
import java.util.Scanner;

public class A474 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String shift = sc.nextLine();
        String s = sc.nextLine();
        String[] keyboard = {"qwertyuiop", "asdfghjkl;", "zxcvbnm,./"};
        int sh = 1;
        if (shift.equals("R")) sh = -1;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int pos = 0;
            int ind = 0;
            for (int j = 0; j < 3; j++) {
                if (keyboard[j].indexOf(c) != -1) {
                    pos += keyboard[j].indexOf(c);
                    break;
                }
                else
                    ind++;
            }
            sb.append(keyboard[ind].charAt(pos + sh));
        }
        System.out.println(sb.toString());
    }
}

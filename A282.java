package com.company;

import java.util.Scanner;

public class A282 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 0;
        sc.nextLine();
        while (n-- > 0){
            String s = sc.nextLine();
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '+') {
                    x += 1;
                    break;
                }
                else if (s.charAt(i) == '-') {
                    x -= 1;
                    break;
                }
            }
        }
        System.out.println(x);
    }
}

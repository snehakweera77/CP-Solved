package com.company;
import java.io.*;
import java.util.HashSet;
import java.util.Scanner;

public class A443 {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        HashSet<Character> set = new HashSet<>();
        for (int i = 1; i < s.length() - 1; i++) {
            char c = s.charAt(i);
            if (c != ' '  && c != ','){
                set.add(c);
            }
        }
        System.out.println(set.size());
    }
}

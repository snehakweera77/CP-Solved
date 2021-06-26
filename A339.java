package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class A339 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[] arr = s.split("\\+");
        Arrays.sort(arr);
        System.out.println(String.join("+", arr));
    }
}

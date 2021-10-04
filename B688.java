package com.company;

import java.util.Scanner;

public class B688 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.next());
        System.out.println(sb.toString() + sb.reverse().toString());
    }
}

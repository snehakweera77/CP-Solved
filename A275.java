package com.company;
import java.util.Scanner;

public class A275 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] input = new int[5][5];
        int[][] output = new int[5][5];
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                input[i][j] = sc.nextInt();
                output[i][j] = input[i][j];
            }
        }
        for(int i = 1; i <= 3; i++){
            for(int j = 1; j <= 3; j++){
                if(input[i][j] != 0){
                    output[i][j - 1] += input[i][j];
                    output[i][j + 1] += input[i][j];
                    output[i - 1][j] += input[i][j];
                    output[i + 1][j] += input[i][j];

                }
            }
        }
        for(int i = 1; i <= 3; i++){
            for(int j = 1; j <= 3; j++){
                if(output[i][j] % 2 == 0){
                    System.out.print("1");
                }
                else
                    System.out.print("0");
            }
            System.out.println();
        }
    }
}

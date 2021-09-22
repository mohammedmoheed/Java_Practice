package com.Acty;
import java.util.*;
public class Program1 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n = s.nextInt();
        int[][] arr = new int[n][];
        for (int i = 0; i <n*n; i++) {
            for(int j=0; j<n*n ; j++){

                if(i%n==j%n)
                    System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}

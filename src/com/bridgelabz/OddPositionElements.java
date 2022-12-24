package com.bridgelabz;

import java.sql.SQLOutput;
import java.util.Scanner;

public class OddPositionElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        int[] arr = new int[100];
        System.out.println("Enter Array size: ");
        int n = sc.nextInt();
        System.out.println("Enter Array Elements: ");
        for(i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(i=0;i<n;i=i+2){
            System.out.println(arr[i]);
        }
    }
}

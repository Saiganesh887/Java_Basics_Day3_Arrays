package com.bridgelabz;

import java.util.Scanner;

public class ReverseArrayElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        int i;
        System.out.println("Enter array size: ");
        int n = sc.nextInt();
        System.out.println("Enter array Elements: ");
        for(i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Reverse of Array Elements:");
        for(i = n-1;i >= 0;i--){
            System.out.println(+arr[i]);
        }
    }
}

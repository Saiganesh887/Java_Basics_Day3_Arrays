package com.bridgelabz;

import java.util.Scanner;

public class EvenPositionElements {
    public static void main(String[] args) {
        int[] arr = new int[100];
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array size: ");
        int n = sc.nextInt();
        System.out.println("Enter array Elements: ");
        for(i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Even Elements in array ");
        for(i=1;i<n;i = i+2) {
            System.out.println(arr[i]);
        }
    }
}

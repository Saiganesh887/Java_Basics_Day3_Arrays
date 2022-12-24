package com.bridgelabz;

import java.util.Scanner;

public class DuplicateElementsInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,j;
        int[] arr = new int[100];
        System.out.println("Enter Array size: ");
        int n = sc.nextInt();
        System.out.println("Enter Array Elements: ");
        for(i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Duplicate values in array are:");
        for(i=0;i<n;i++)
            for(j=i+1;j<n;j++)
                if(arr[i] == arr[j]){
                    System.out.println(arr[j]);
                }
    }
}

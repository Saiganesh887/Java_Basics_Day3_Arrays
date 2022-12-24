package com.bridgelabz;

import java.util.Scanner;

public class LargestElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        int i;
        System.out.println("Enter size of Array: ");
        int n = sc.nextInt();
        System.out.println("Enter array Elements: ");
        for(i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        for(i=0;i<n;i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println("Largest Element in Array is: "+ max);
    }
}

package com.bridgelabz;

import java.util.Scanner;

public class SecondLargestNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array size: ");
        int n = sc.nextInt();
        int temp;
        int[] arr = new int[n];
        System.out.println("Enter array Elements: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++)
        {
            for (int j = i + 1; j < n; j++)
            {
                if (arr[i] < arr[j])
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.print("descending Order:");
        for (int i = 0; i < n - 1; i++)
        {
            System.out.print(arr[i] + ",");
        }
        System.out.print(arr[n - 1]);
        System.out.println('\n'+"Second largest number is: "+arr[1]);
    }
}

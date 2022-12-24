package com.bridgelabz;

public class ArrayElements {
    public static void main(String[] args) {
        int[] a= new int[5];
        a[3] = 56;
        double[] b = {2.99,3,45.99};
        for(int i=0;i<a.length;i++)
        System.out.println(a[i]);
        for(int i=0;i<b.length;i++)
        System.out.println("b array value: "+b[i]);
    }
}

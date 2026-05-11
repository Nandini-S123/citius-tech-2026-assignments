package com.citiustech;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
       
        Scanner scan = new Scanner(System.in);
       
        System.out.println("Enter the size of an array = " );
        int n = scan.nextInt();
       
       
        System.out.println("Enter the array = " );
        int[] arr = new int[n];
       
        for (int i = 0; i< n; i++) {
            arr[i] = scan.nextInt();
        }
       
        System.out.println("Enter the count pair to sum = " );
        int k = scan.nextInt();
       
        int maximum = arr[0];
        int minimum = arr[0];
        for(int i = 0; i < n; i++) {
           
            if(arr[i] > maximum) {
                maximum = arr[i];
            }
           
            if(arr[i] < minimum) {
                minimum = arr[i];
            }
        }
       
        //for count pair
        int count = 0;
        for (int i = 0; i< n; i++) {
            for(int j = i+1; j < n; j++) {
                if (arr[i] + arr[j] == k) {
                    count ++;
                }
            }
        }

        System.out.println("Maximum = " + maximum +  ", Minimum = " +minimum);
        System.out.println("Count of pairs with sum " + k  + " = " +count);
        scan.close();
    }

}

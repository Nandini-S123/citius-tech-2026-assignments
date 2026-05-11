package com.citiustech;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       
        System.out.println("Enter the String = " );
        String str = scan.nextLine();
       
        String result = " ";
        for (int i = 0; i <str.length(); i++) {
            char ch = str.charAt(i);
           
            if (Character.isUpperCase(ch)) {
                result += (Character.toLowerCase(ch));
               
            }
            else if (Character.isLowerCase(ch)) {
                result += (Character.toUpperCase(ch));
            }
            else {
                result += ch;
            }
        }
        System.out.println("Result = " + result);
        scan.close();

    }

}

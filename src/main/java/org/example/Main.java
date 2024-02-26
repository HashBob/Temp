package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println( "Enter 6 numbers as input" );
        Scanner c = new Scanner(System.in);
        int arr[] = new int[6];
        for(int i=0;i<arr.length;i++){
            arr[i]=c.nextInt();
        }
        Calculator calculator= new Calculator(arr);
        System.out.println("The sum of all even numbers is: "+calculator.sum());
    }
}
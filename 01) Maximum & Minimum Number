package com.shrayansh;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = in.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = in.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = in.nextInt();
        int largest = largest(num1, num2, num3);
        int smallest = smallest(num1, num2, num3);
        System.out.println("Largest number is= " + largest);
        System.out.println("Smallest number is: " + smallest);
    }
    static int largest(int a, int b, int c) {
        int max = a;
        if (b > max) {
            max=b;
        }
        if (c > max) {
            max=c;
        }
        return max;
    }
    static int smallest(int a, int b, int c) {
        int min = a;
        if (b < min) {
            min=b;
        }
        if (c < min) {
            min=c;
        }
        return min;
    }
}


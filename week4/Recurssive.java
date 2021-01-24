package com.hatsumi.week4;

public class Recurssive {
    public static void main(String[] args){
        System.out.println(factorial(5));
    }

    public static int factorial(int n){
        if (n == 0){
            return 1; // base case
        }
        else
            return n * factorial(n-1); // recursive case
    }
}

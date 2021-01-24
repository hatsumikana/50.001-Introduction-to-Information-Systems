package com.hatsumi.pset1a;

public class PrimeNumber{
    public static int isPrime(int num){
        int y = 1;
        for (int i=2; i < num;i++){
            if (num%i == 0){
                int x = 0;
                return x;
            }
        }
        return y;
    }
}

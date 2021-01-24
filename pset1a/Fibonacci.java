package com.hatsumi.pset1a;

import java.*;
import java.io.*;
import java.util.*;

public class Fibonacci{
    public static String fibonacci( int n ) {
        int a = 0;
        int b = 1;

        String ans = "";
        ans = "" + a + "," + b;

        for (int i = 2; i < n; i++) {
            int temp = a + b;
            a = b;
            b = temp;

            ans = ans + "," + temp;

        }
        return ans;
    }

    public static void main (String args[])
    {
        int n;
        n = Integer.parseInt(args[0]);
        String ans = "";

        Fibonacci fibo = new Fibonacci();
        ans = fibo.fibonacci(n);

        System.out.println(ans);
    }

}


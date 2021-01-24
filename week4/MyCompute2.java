package com.hatsumi.week4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MyCompute2 {
    public static void main(String[] args){
        // METHOD 2
        try{
            int z = compute2(1,1);
        }
        catch(FileNotFoundException ex){
            System.out.println("File 2 not found!");
        }

        // Exception handling
        try{
            int w = compute(1,0);
        }
        catch(ArithmeticException ex){
            System.out.println("Some exception has occurred!");
        }
        catch(NullPointerException ex){
            System.out.println("Some exception has occurred!");
        }
        System.out.println("Continue to execute");
    }

    public static int compute(int i, int j){
        try {
            Scanner s = new Scanner(new File("input.txt")); // checked exception, it will force you to do a try-catch block
        }
        catch(FileNotFoundException ex) {
            System.out.println("File does not exist");
        }
            int y = i / j; // unchecked exception
            return y;
    }
    // METHOD 2 for checked exception
    public static int compute2(int i, int j) throws FileNotFoundException{
        Scanner s = new Scanner(new File("input.txt")); // checked exception
        int y = i / j;
        return y;
    }
}

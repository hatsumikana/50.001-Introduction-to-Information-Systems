package com.hatsumi.week4;

public class myCompute {
    public static void main(String[] args) {
        int w = sample(1,0);
    }

    public static int sample(int i, int j){
        try{
            int y = i/j;
            return y;
        }
        catch (ArithmeticException ex){
            return 0;
        }
        finally {
            System.out.println("clean up");
        }

    }
}



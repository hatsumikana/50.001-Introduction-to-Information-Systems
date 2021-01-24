package com.hatsumi.pset1a;

import java.util.List;
public class IteratingExample {
    public static int Act2Iterator(List<Integer> integers) {
        int sum = 0;

        // Insert code here to sum up input using an Iterator ...
        for (int i: integers){
            sum += i;
        }

        return sum;
    }
}
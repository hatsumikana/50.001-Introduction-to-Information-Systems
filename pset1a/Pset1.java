package com.hatsumi.pset1a;

import java.util.Arrays;

public class Pset1 {
    public static boolean isAllCharacterUnique(String sIn) {
        //todo: add your implementation

        int MAX_CHAR = 128;

        if (sIn.length() > 128){
            return false;
        }

        else {
            boolean[] chars = new boolean[MAX_CHAR];
            Arrays.fill(chars, false);
            for (int i=0 ; i < sIn.length(); i++){
                int index = (int)sIn.charAt(i); // Getting the current position of the character in the ASCII index

                if (chars[index] == false){ // if the entry in chars is false, it becomes true
                    chars[index] = true;
                }

                else return false; // if it is true, it is a duplicate
            }
        }
        return true; // if no duplicates is found return true
    }
    public static boolean isPermutation(String sIn1, String sIn2) {
        //todo: add your implementation
        if (sIn1.length() != sIn2.length()){
            return false;
        }

        else{
            char[] array1 = sIn1.toCharArray();
            char[] array2 = sIn2.toCharArray();

            Arrays.sort(array1);
            Arrays.sort(array2);

            for (int i=0; i<sIn1.length(); i++){
                if (array1[i] != array2[i]){
                    return false;
                }
                else return true;
            }
        }
        return false;
    }

    public static void main (String[] args) {

        System.out.println(Pset1.isAllCharacterUnique("abcdefghijklmnopqrstuvABC"));
        System.out.println(Pset1.isAllCharacterUnique("abcdefgghijklmnopqrstuvABC"));
        System.out.println(Pset1.isPermutation("@ab", "a@b"));
        System.out.println(Pset1.isPermutation("abcd", "bcdA"));

    }
}



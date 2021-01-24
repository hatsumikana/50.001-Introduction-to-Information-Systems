package com.hatsumi.Palindrome;

public class Palindrome {
    public static boolean isPalindrome (char[] S) {
        int j = 0;
        while (j < S.length/2){
            if (S[j] != S[S.length-j-1]){
                    return false;
            }
            j++;
        }
        return true;
    }
}


/* ATTENTION
The method isPalindrome() returns true if the input string is a palindrome, and false otherwise.
It is NOT NECESSARY to do any System.out.println() of "abba is a palindrome" etc.
*/


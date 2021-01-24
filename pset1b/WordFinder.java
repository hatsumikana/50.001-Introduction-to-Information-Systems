package com.hatsumi.pset1b;

import java.util.HashMap;
import java.util.Map;

public class WordFinder {
    /**
     * Given a String (the haystack) and an array of Strings (the needles),
     * return a Map<String, Integer>, where keys in the map correspond to
     * elements of needles that were found as substrings of haystack, and the
     * value for each key is the lowest index of haystack at which that needle
     * was found. A needle that was not found in the haystack should not be
     * returned in the output map.
     *
     * @param haystack The string to search into.
     * @param needles The array of strings to search for. This array is not
     *                mutated.
     * @return The list of needles that were found in the haystack.
     */
    public static Map<String, Integer> getSubstrings(String haystack,
                                                     String[] needles) {
        // TODO: Implement (Problem e)
        // Generating a new HashMap
        HashMap<String, Integer> newHashMap = new HashMap<String, Integer>();
        for(String needle: needles) {
            if(!newHashMap.containsKey(needle)){
                int i = WordFinder.retrieve(haystack,needle);
                if(i >= 0) {
                    newHashMap.put(needle,i);
                }
            }
        }
        return newHashMap;
    }

    private static int retrieve(String haystack, String s) {
        if(haystack.length() < s.length()){
            return -1;
        }
        int difference = haystack.length() - s.length();
        for(int i=0; i <= difference; i++){
            int num = 0;
            while(num < s.length() && s.charAt(num) == haystack.charAt(i+num)){
                num++;
            }
            if(num==s.length()){
                return i;
            }
        }
        return -1;
    }
}

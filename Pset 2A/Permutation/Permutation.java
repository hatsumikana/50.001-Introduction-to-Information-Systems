package com.hatsumi.Permutation;

import java.util.ArrayList;

public class Permutation {
    private final String in;
    private ArrayList<String> a = new ArrayList<String>();
    // additional attribute if needed
    int count = 1;
    String current = "";

    Permutation(final String str){
        in = str;
        // additional initialization if needed
        if(in.length()>0)
            a.add(in.substring(0,1));
    }

    public void permute(){
        // produce the permuted sequence of 'in' and store in 'a', recursively
        if(in.isEmpty() || a.get(0).length() == in.length()){
            return;
        }
        ArrayList<String> temp = new ArrayList<String>();
        current = in.substring(count,count+1);
        for(String i: a){
            for(int k=0; k <= count; k++){
                temp.add(i.substring(0,k)+ current + i.substring(k));
            }
        }
        a = temp;
        count++;
        permute();
    }

    public ArrayList<String> getA(){
        return a;
    }
}

class TestPermutation{
    public static void main(String[] args){
        ArrayList<String> v;

        Permutation p = new Permutation("ha");
        p.permute();
        v=p.getA();
        System.out.println(v);
    }
}


package com.hatsumi.OctagonComparable;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {
        ArrayList<Octagon> l = new ArrayList<Octagon>();
        l.add(new Octagon(2));
        l.add(new Octagon(3));
        l.add(new Octagon(1));
        l.add(new Octagon(10));
        Collections.sort(l);
        for (Octagon o:l)
            System.out.println(o.getSide());
    }
}

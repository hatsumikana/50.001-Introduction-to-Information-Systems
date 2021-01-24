package com.hatsumi.OctagonComparable;
import java.util.*;

//Modify the class header and implement any necessary methods
public class Octagon implements Comparable<Octagon>{

    private double side;
    public Octagon(double side){
        this.side = side;
    }
    public double getSide() {
        return side;
    }

    @Override
    public int compareTo(Octagon oct) {
        if(side > oct.side)
            return 1;
        else if(side == oct.side)
            return 0;
        else
            return -1;
    }

}

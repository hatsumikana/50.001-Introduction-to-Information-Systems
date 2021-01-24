package com.hatsumi.OctagonComparator;

import java.util.*;

//Modify the class header to implement the appropriate interface
public class OctagonComparator implements Comparator<Octagon>{

    //then implement the method(s) in the interface
    @Override
    public int compare(Octagon o, Octagon t1) {
        if(o.getSide() > t1.getSide())
            return 1;
        else if(o.getSide() == t1.getSide())
            return 0;
        else
            return -1;
    }

}


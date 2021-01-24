package com.hatsumi.week3;

class Bird {
    public void sing(){
        System.out.println(" tweet tweet tweet ");
    }
}

// Polymorphism
class Robin extends Bird{
    public void sing(){
        System.out.println(" twiddledeedee ");
    }
}

class Pelican extends Bird {

}

public class Polymorphism {
    public static void main(String[] args){
        Robin c = new Robin();
        Pelican b = new Pelican();
        c.sing();
        b.sing();
    }
}
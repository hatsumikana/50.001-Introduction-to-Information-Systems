package com.hatsumi.week3;

interface DogInterface{
    void bark();
    void poop();
}

abstract class Dog{
    String breed = "Chihuahua";

    // abstract method
    public void bark() {
        System.out.println("Bark!");
    }
    public abstract void poop();
}

class Chihuahua extends Dog{
    public void poop(){
        System.out.println("Dog pooped!");
    }
}

class bulldog implements DogInterface{
    public void bark() {
        System.out.println("Grrrrr");
    }
    public void poop(){
        System.out.println("Pooped!");
    }
}

public class AbstractTutorial {
    public static void main(String[] args) {
        Chihuahua d = new Chihuahua();
        d.bark();
        System.out.println(d.breed);

        bulldog b = new bulldog();
        b.bark();
        b.poop();
    }
}
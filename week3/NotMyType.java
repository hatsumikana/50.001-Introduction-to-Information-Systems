package com.hatsumi.week3;

class Parent{
    void show(){
        System.out.println("Parent");
    }
}

class Child extends Parent{
    @Override
    void show() {
        System.out.println("Child");
    }

    void showChild() {
        System.out.println("Show Child");
    }
}

public class NotMyType {
    public static void main(String[] args){
//        int a = (int) 0.5;
//        System.out.println(a);

        // Up Casting -- Using the parent to show the child class
        Parent obj1 = new Child();
        obj1.show();

        // Down Casting
        Child obj2 = (Child) obj1;
        obj2.showChild();
    }
}

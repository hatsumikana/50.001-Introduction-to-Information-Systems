package com.hatsumi.week3.Interface;

interface WaterBottleInterface{
    String color = "Blue";
    void fillUp();
    void pourOut();
}

class Interface implements WaterBottleInterface{
    public static void main(String[] args){
        System.out.println(color);
        Interface ex = new Interface();
        ex.fillUp();
    }

    @Override
    public void fillUp() {
        System.out.println("It is filled!");
    }

    @Override
    public void pourOut() {

    }
}

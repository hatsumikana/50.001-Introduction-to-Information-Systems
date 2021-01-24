package com.hatsumi.week5.visitor2;
// Activity: Use Visitor design pattern to compute the total tax income

import java.util.ArrayList;

public class test {

    public static void main(String[] args) {

        ArrayList<Visitable> items = new ArrayList<Visitable>();
        TaxVisitor tax = new TaxVisitor();
        items.add(new Car(10000));
        items.add(new Alcohol(100));
        items.add(new Chocolate(10));
        items.add(new Alcohol(200));

        // print total tax income based on the two taxing systems
        for(Visitable i:items){
            i.accept(tax);
        }
        System.out.println(tax.gst);
    }
}

class Car implements Visitable{
    private double price;

    public Car(double price){
        this.price=price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public void accept(Visitor v) {
        System.out.println("Processing car tax ...");
        v.visit(this);
    }
}

class Alcohol implements Visitable{
    private double price;

    public Alcohol(double price){
        this.price=price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public void accept(Visitor v) {
        System.out.println("Processing alcohol tax ...");
        v.visit(this);
    }
}

class Chocolate implements Visitable{
    private double price;

    public Chocolate(double price){
        this.price=price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public void accept(Visitor v) {
        System.out.println("Processing chocolate tax ...");
        v.visit(this);
    }
}


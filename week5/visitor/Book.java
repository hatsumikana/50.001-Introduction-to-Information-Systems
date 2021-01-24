package com.hatsumi.week5.visitor;

public class Book implements Visitable{
    private double weight;
    public Book(double weight) {this.weight = weight;}
    public double getWeight(){return this.weight;}

    public void accept(Visitor v){
        System.out.println("Processing Book ...");
        v.visit(this);
    }
}

class Clothing implements Visitable{
    private int size;
    public Clothing(int size) { this.size = size;}
    public int getSize() {return this.size;}
    public void accept(Visitor v){
        System.out.println("Processing Clothing ...");
        v.visit(this);
    }
}

class CD implements Visitable{
    private String title;
    public CD(String title) {this.title = title;}
    public String getTitle() {return this.title;}
    public void accept(Visitor v) {
        System.out.println("Processing CD ...");
        v.visit(this);
    }
}

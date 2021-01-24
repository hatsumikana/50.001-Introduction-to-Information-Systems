package com.hatsumi.week5.visitor;

import java.util.ArrayList;

public class MyClass {
    public static void main(String[] args){
        ArrayList<Visitable> items = new ArrayList<>();
        PostageVisitor postage = new PostageVisitor();
        PostageOverseaVisitor postageOversea = new PostageOverseaVisitor();


        items.add(new Book(1));
        items.add(new Clothing(12));
        items.add(new Book(21));
        items.add(new CD("BTS"));

        for (Visitable o:items) {
            o.accept(postageOversea);
        }
        System.out.println(postageOversea.getTotal());

        postage.setTotal(0);
        ArrayList<Visitable> items2 = new ArrayList<>();
        items2.add(new Book(1));
        items2.add(new Book(2));

        for (Visitable o:items2){
            o.accept(postage);
        }
        System.out.println(postage.getTotal());
    }
}
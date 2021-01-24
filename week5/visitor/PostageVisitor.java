package com.hatsumi.week5.visitor;

// Concrete Visitor
public class PostageVisitor implements Visitor{

    public double total = 0;

    public double getTotal() {
        return total;
    }

    public void setTotal(double total){
        this.total = total;
    }

    @Override
    public void visit(Book b) {
        total+= b.getWeight() * 10;
    }

    @Override
    public void visit(CD c) {
        if(c.getTitle() == "BTS"){
            total += 10;
        }

        else {
            total += 1;
        }
    }

    @Override
    public void visit(Clothing c) {
        if(c.getSize() > 10){
            total += 20;
        }

        else{
            total += 10;
        }
    }
}

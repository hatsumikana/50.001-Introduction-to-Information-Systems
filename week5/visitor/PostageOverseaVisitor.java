package com.hatsumi.week5.visitor;

class PostageOverseaVisitor implements Visitor{
    public double total = 0;

    public double getTotal() {
        return total;
    }

    public void setTotal(double total){
        this.total = total;
    }

    @Override
    public void visit(Book b) {
        total+= b.getWeight() * 100;
    }

    @Override
    public void visit(CD c) {
        if(c.getTitle() == "BTS"){
            total += 100;
        }

        else {
            total += 10;
        }
    }

    @Override
    public void visit(Clothing c) {
        if(c.getSize() > 100){
            total += 200;
        }

        else{
            total += 100;
        }
    }
}

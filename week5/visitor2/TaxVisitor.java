package com.hatsumi.week5.visitor2;

public class TaxVisitor implements Visitor{

    public double gst = 0;
    public double getGst(){return gst;}
    public void setGst(double gst){this.gst = gst;}

    @Override
    public void visit(Car c) {
        gst += c.getPrice()*0.08;
    }

    @Override
    public void visit(Alcohol a) {
        if(a.getPrice() > 100)
            gst += a.getPrice()*0.1;
        else
            gst += a.getPrice()*0.01;
    }

    @Override
    public void visit(Chocolate c) {
        gst += c.getPrice()*0.001;
    }
}

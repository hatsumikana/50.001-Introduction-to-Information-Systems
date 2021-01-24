package com.hatsumi.week5.observer2;

//Todo: implements the Observer interface, register itself to StockGrabber
public class StockObserver implements Observer{

    private double ibmPrice;   // update from Subject
    private double googPrice;  // update from Subject
    private String id;
    private Subject subject;

    public StockObserver(String id, Subject subject){
        this.id = id;
        this.subject = subject;
        this.subject.register(this);
    }

    @Override
    public void update(double msg) {
        String s = "Stock price changed!" ;
        System.out.println(s);
    }
}

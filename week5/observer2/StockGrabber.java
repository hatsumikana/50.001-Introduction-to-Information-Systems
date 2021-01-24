package com.hatsumi.week5.observer2;

// Todo: StockGrabber implements Subject, keeps track of the list of subscribers, notifies them any change in stock prices

import java.util.ArrayList;

public class StockGrabber implements Subject{
    private double ibmPrice;
    private double googPrice;
    private ArrayList<Observer> observers = null;
    private String msg = null;

    public void setIbmPrice(double ibmPrice){
        this.ibmPrice= ibmPrice;
        if(this.ibmPrice > 100){
            notifyObserver();
        }
    }

    public void setGoogPrice(double googPrice){
        this.googPrice= googPrice;
        if(this.googPrice < 10){
            notifyObserver();
        }
    }

    @Override
    public void register(Observer o) {
        observers.add(o);
    }

    @Override
    public void unregister(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObserver() {
        for(Observer o:observers)
            o.update(this.googPrice);
    }
}
package com.hatsumi.week5.TestMessageBoard2;

import java.util.ArrayList;

public class Topic implements Subject{
    private String message = null;
    private ArrayList<Observer> observers = new ArrayList<Observer>();

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
        for(Observer o: observers){
            o.update(message);
        }
    }

    public void postMessage(String message){
        this.message = message;
        notifyObserver();
    }
}

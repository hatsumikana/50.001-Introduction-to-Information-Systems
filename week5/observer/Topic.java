package com.hatsumi.week5.observer;

import java.util.ArrayList;

public class Topic implements Subject {
    private ArrayList<Observer> observers = null;
    private String msg = null;

    Topic(){
        observers = new ArrayList<>();
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
    public void notifyObservers() {
        for(Observer o:observers)
            o.update(msg);
    }

    public void postMessage(String msg){
        this.msg = msg;
        notifyObservers();
    }
}

package com.hatsumi.week5.observer;

public interface Subject {
    void register(Observer o);
    void unregister(Observer o);
    void notifyObservers();
}


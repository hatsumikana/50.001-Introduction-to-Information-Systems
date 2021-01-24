package com.hatsumi.week5.observer2;

public interface Subject {
    void register(Observer o);
    void unregister(Observer o);
    void notifyObserver();
}

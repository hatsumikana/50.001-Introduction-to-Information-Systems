package com.hatsumi.week5.TestMessageBoard2;

public class Subscriber implements Observer{
    private Subject subject = null;
    private int observerID;
    private static int observerIdTrack = 0;

    public Subscriber(Subject subject){
        this.subject = subject;
        this.subject.register(this); //register itself into the list of observers
        observerID = observerIdTrack++;
    }

    @Override
    public void update(String message) {
        System.out.println("subscriber "+ observerID + " got notified " + message);
    }
}

package com.hatsumi.week5.observer;

public class MyClass {
    public static void main(String[] args){
        Topic topic50001 = new Topic();
        Student scott = new Student("scott", topic50001);
        Student norman = new Student("norman", topic50001);

        topic50001.postMessage("new semester starts");

        Student man = new Student("man", topic50001);

        topic50001.postMessage("checkoff 1 this week ");
        topic50001.unregister(man);
        topic50001.postMessage("great, man is gone!");
    }
}
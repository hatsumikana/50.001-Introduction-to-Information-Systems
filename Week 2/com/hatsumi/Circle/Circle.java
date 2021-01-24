package com.hatsumi.Circle;

public class Circle {
    double radius = 1.0;

    // Default Constructor
    Circle(){}

    // Overloading the constructor
    Circle(double newRadius){
        radius = newRadius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    // Method or Behaviour
    double getArea(){
        return radius * radius * 3.14;
    }
}
package com.hatsumi.pset1a;

public class MyRectangle2D {

    public static void main ( String[] args){
        MyRectangle2D rectangle = new MyRectangle2D(0,0,10,10);
        MyRectangle2D r = new MyRectangle2D(4,2,4,4);

        System.out.println(rectangle.contains(120,120));
        System.out.println(rectangle.getArea());

        System.out.println(rectangle.overlaps(r));
    }

    private double x;
    private double y;
    private double width;
    private double height;


    // No arg Constructor
    public MyRectangle2D(){
        x = 0;
        y = 0;
        width = 1;
        height = 1;
    }

    // Constructor
    public MyRectangle2D(double x, double y, double width, double height){
        setX(x);
        setY(y);
        setWidth(width);
        setHeight(height);
    }

    // Mutator
    public void setX(double x){
        this.x = x;
    }

    // Accessor
    public double getX(){
        return this.x;
    }

    //Mutator
    public void setY(double y){
        this.y = y;
    }

    // Accessor
    public double getY(){
        return this.y;
    }

    // Mutator
    public void setWidth(double width){
        this.width = width;
    }

    //Accessor
    public double getWidth(){
        return this.width;
    }

    // Mutator
    public void setHeight(double height){
        this.height = height;
    }

    // Accessor
    public double getHeight(){
        return this.height;
    }

    public double getArea(){
        double area = this.width * this.height;
        return area;
    }

    public double getPerimeter(){
        double perimeter = (2 * this.width) + ( 2 * this.height);
        return perimeter;
    }

    public boolean contains(double x, double y) {
        if (x < (this.x + this.width / 2) && x > (this.x - this.width / 2)) {
            if (y < (this.y + this.height / 2) && y > (this.y - this.height / 2)) {
                return true;
            }
        }
        return false;
    }

    public boolean contains(MyRectangle2D r){
        if ((r.x + r.width/2) < (this.x + this.width/2) && (r.x - r.width/2) > (this.x - this.width/2) && (r.y + r.height/2) < (this.y + this.height/2) && (r.y - r.height/2) > (this.y - this.height/2)) {
            return true;
        }
        else{return false;}
    }

    public boolean overlaps(MyRectangle2D r){
        boolean bool_contains = this.contains(r);
        System.out.println(bool_contains);
        boolean outside;
        if ((r.getX() +r.getWidth()/2) < (this.getX() - this.getWidth()/2) || (r.getX() - r.getWidth()/2) > (this.getX() + this.getWidth()/2) || (r.getY() + r.getHeight()/2) < (this.getY() - this.getHeight()/2) || (r.getY() - r.getHeight()/2) > (this.getY() + this.getHeight()/2)){
            outside = true;
        }
        else { outside = false;}
        System.out.println(outside);


        if (bool_contains == false && outside == false){

            return true;
        }
        else{ return false;}

    }

}


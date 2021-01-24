package com.hatsumi.week5.observer2;

public class Test {
    public static void main(String[] args) {
        StockGrabber stock1 = new StockGrabber();
        StockObserver scott = new StockObserver("scott",stock1);
        StockObserver norman = new StockObserver("norman", stock1);
        stock1.setGoogPrice(11);
        stock1.setIbmPrice(101);
    }

}

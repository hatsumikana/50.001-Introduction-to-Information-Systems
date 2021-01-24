package com.hatsumi.week3.Interface2;

public class C1 implements I1{
    public static void main(String[] args){
        C1 a = new C1();
    }
    @Override
    public void p1(){ return;}
    @Override
    public void p11(){return;}
    @Override
    public void p12(){return;}
}

abstract class c2 extends C1 implements I21, I22{
    public void p21() {return;}
    public void p22() {return;}

}

interface I11{
    void p11();
}

interface I12{
    void p12();
}

interface I1 extends I11, I12{
    void p1();
}

interface I21{
    void p21();
}

interface I22{
    void p22();
}

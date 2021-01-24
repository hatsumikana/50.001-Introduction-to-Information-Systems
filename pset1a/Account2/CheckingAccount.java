package com.hatsumi.pset1a.Account2;

import java.util.Date;

public class CheckingAccount extends Account{

    public static void main(String[] args) {
        CheckingAccount myCheckAcc = new CheckingAccount(1024, 8000.0);
        myCheckAcc.deposit(2000);
        myCheckAcc.withdraw(15000);

        System.out.println(myCheckAcc.getBalance());
        myCheckAcc.withdraw(200);
        System.out.println(myCheckAcc.getBalance());
        myCheckAcc.deposit(7000);
        myCheckAcc.withdraw(200);
        System.out.println(myCheckAcc.getBalance());
    }

    public double overdraft = -5000;

    public CheckingAccount(){
        super();
    }

    public CheckingAccount(int id, double balance){
        super(id, balance);
    }

    @Override
    public void withdraw(double money) {
        if (getBalance() - money >= overdraft){
            setBalance(getBalance() - money);
        }
        else {
            System.out.println("over limit");
        }
    }
}
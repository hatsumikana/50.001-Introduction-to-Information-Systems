package com.hatsumi.pset1a.Account2;

import java.util.Date;

public class Account {
    private int id;
    private double balance;
    private static double annualInterestRate;
    private Date dateCreated = new Date();

    // Constructor with no arg
    public Account(){
        id = 0;
        balance = 0;
        annualInterestRate = 0;
    }

    public Account(int id, double balance){
        setAccountid(id);
        setBalance(balance);
        dateCreated.toString();
    }


    // Mutator
    public void setAccountid(int id){
        this.id = id;
    }

    // Accessor
    public int getAccoundid(){
        return id;
    }

    // Mutator
    public void setBalance(double balance){
        this.balance = balance;
    }

    // Accessor
    public double getBalance(){
        return balance;
    }
    // Mutator
    public static void setAnnualInterestRate(double annualInterestRate){
        Account.annualInterestRate = annualInterestRate;
    }
    // Accessor
    public static double getAnnualInterestRate(){
        return annualInterestRate;
    }
    // Accessor
    public Date getdateCreated(){
        return dateCreated;
    }


    //complete the requirements of this question here
    public static double getMonthlyInterestRate()
    {
        double monthly = Account.annualInterestRate / 12;
        return monthly;
    }

    public double getMonthlyInterest(){
        double rate = getMonthlyInterestRate();
        double interest = balance * (rate/100);
        return interest;
    }

    public void withdraw(double money){
        balance = balance - money;
    }

    public void deposit(double money){
        balance = balance + money;
    }
}


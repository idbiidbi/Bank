package entity;

import java.util.Scanner;

public class User {


    // variables
    public String accountNumber;
    private double balance;
    public String name;
    public String gender;


    // constructor
    public User(String accountNumber, double balance, String name, String gender) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.name = name;
        this.gender = gender;

    }


    //method get “get” — “получать” (т.е. “метод для получения значения поля”)
    public double getBalance() {

        return balance;
    }

    //method set "set" — “устанавливать” (т.е. “метод для установки значения поля”)
    public void setBalance(double balance) {

        this.balance = balance;
    }



}

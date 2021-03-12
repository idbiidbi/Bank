package controller;

import entity.User;

public class Bank {

    // variables
    private User user;

    // no constructor

    // method (кто-то зашел в банк)
    public String setActiveUser (User user){

        this.user = user;
        return "user update succesuful";

    }

    // method
    public double getUserBalance() {
        return user.getBalance();

    }

    // method
    public String creditUser(double credit){
        double newBalance = user.getBalance() + credit;
        this.user.setBalance(newBalance);
        return credit + " added to your balance";
    }

    // method
    public String debetUser(double amount) {
        // System.out.println("Your balance " + getUserBalance());
        if (amount<=getUserBalance()){
            double newBalance = getUserBalance() - amount;
            this.user.setBalance(newBalance);
            return amount + " put on your deposit";}
        return "Not enough money for a deposit, you need at least " + amount;

    }

}





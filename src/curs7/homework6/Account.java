package curs7.homework6;

public class Account {
    private int accountNumber;
    public double balance;
    public Customer accountOwner;

    public Account (int accountNumber, double balance, Customer accountOwner){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountOwner = accountOwner;
    }

    public void withdraw(double amount) throws InsuficientFundsException {


    }


}

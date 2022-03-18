package curs7.homework6;

import java.util.Scanner;

public class TestSavingsAccount {

    public static void main (String[]args)  {
        Scanner scanner = new Scanner(System.in);
        Customer alex = new Customer("Alex","Bucharest","alex@alex.com");
        SavingsAccount alexSavings = new SavingsAccount(1,200.0,alex);
        System.out.println("Hello " + alexSavings.getName());
        System.out.println("Please enter the amount to withdraw");
        try {
            alexSavings.withdraw(scanner.nextDouble());
        } catch (InsuficientFundsException e) {
            e.printStackTrace();
        }
    }

}

package curs7.homework6;

public class SavingsAccount extends Account {


    public SavingsAccount(int accountNumber, double balance, Customer accountOwner) {
        super(accountNumber, balance, accountOwner);
    }

    @Override
    public void withdraw(double amount) throws InsuficientFundsException {
        if(amount <=balance){
            balance -= amount;
            System.out.println("Please pick your money!");
            System.out.println("Your new balance is " + balance);
            System.out.println("Thank you for using our ATM!");
        }else {
            System.out.println("The amount you entered is greater than the available balance " + balance);
            System.out.println("Thank you for using our ATM");
            throw new InsuficientFundsException("Insufficient funds for transaction");
        }

    }

    public String getName(){
        return accountOwner.getName();
    }
}

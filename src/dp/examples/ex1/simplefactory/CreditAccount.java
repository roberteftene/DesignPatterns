package dp.examples.ex1.simplefactory;

public class CreditAccount extends AbstractBankAccount {

    public CreditAccount(String ownerName,double accountBalance) {
        super(ownerName,accountBalance);
    }

    @Override
    public void transfer(IBankAccount destination, double amount) {
        System.out.println("You cannot transfer money from a Credit account");
    }

    @Override
    public void deposit(double amount) {
        System.out.println("Depositing..."  + amount);
        this.accountBalance += amount;
    }
}

package dp.examples.ex1.simplefactory;

public class DebitAccount extends AbstractBankAccount {

    public DebitAccount(String ownerName, double accountBalance) {
        super(ownerName,accountBalance);
    }

    @Override
    public void transfer(IBankAccount destination, double amount) {
        System.out.println("Sending: " + amount + " to: " + this.ownerName);
        destination.deposit(amount);
    }

    @Override
    public void deposit(double amount) {
        System.out.println("Depositing..."  + amount);
        this.accountBalance += amount;
    }
}

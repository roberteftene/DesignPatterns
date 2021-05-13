package dp.examples.ex1.simplefactory;

public abstract class AbstractBankAccount implements IBankAccount {
    String ownerName;
    double accountBalance;

    public AbstractBankAccount(String ownerName,double accountBalance) {
        this.accountBalance = accountBalance;
        this.ownerName = ownerName;
    }

    public String getOwnerName() {
        return ownerName;
    }


}

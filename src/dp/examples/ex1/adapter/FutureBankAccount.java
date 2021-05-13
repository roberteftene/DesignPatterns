package dp.examples.ex1.adapter;

public class FutureBankAccount implements IBankAccountNew{

    String ownerName;

    public FutureBankAccount(String ownerName) {
        this.ownerName = ownerName;
    }

    @Override
    public void accountTransfer(IBankAccountNew account, double amount) {
        System.out.println("Transfer in progress...");
    }
}

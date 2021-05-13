package dp.examples.ex1.adapter;
import dp.examples.ex1.simplefactory.AbstractBankAccount;
import dp.examples.ex1.simplefactory.IBankAccount;
import dp.examples.ex1.singleton.Bank;

public class BankAccountAdapter implements IBankAccountNew {

    IBankAccount adapteeAccount = null;

    public BankAccountAdapter(IBankAccount adapteeAccount) {
        this.adapteeAccount = adapteeAccount;
    }

    @Override
    public void accountTransfer(IBankAccountNew account, double amount) {
        FutureBankAccount futureBankAccount = (FutureBankAccount) account;
        IBankAccount iBankAccount = Bank.getBankAccountByOwnerName(((FutureBankAccount) account).ownerName);
        this.adapteeAccount.transfer(iBankAccount,amount);
    }

}

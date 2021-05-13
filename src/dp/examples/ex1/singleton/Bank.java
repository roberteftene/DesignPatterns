package dp.examples.ex1.singleton;
import dp.examples.ex1.simplefactory.AbstractBankAccount;
import dp.examples.ex1.simplefactory.CreditAccount;
import dp.examples.ex1.simplefactory.IBankAccount;

import java.util.ArrayList;
import java.util.List;

public class Bank  {
    String name;
    String address;
    int currentAccountNoCounter;
    List<IBankAccount> bankAccounts = new ArrayList<>();

    public static Bank bankInstance = null;

    private Bank() {}

    private Bank(String name, String address, int currentAccountNoCounter) {
        this.name = name;
        this.address = address;
        this.currentAccountNoCounter = currentAccountNoCounter;
    }

    public static synchronized Bank getInstance(String name, String address, int currentAccountNoCounter) {
        if(bankInstance == null) {
            bankInstance = new Bank(name,address,currentAccountNoCounter);
        }
        return bankInstance;
    }

    public void addBankAccount(IBankAccount account) {
        if(bankAccounts.contains(account)) {
            System.out.println("Already have this account");
        } else {
            bankAccounts.add(account);
            this.currentAccountNoCounter++;
        }
    }

    public List<IBankAccount> getBankAccounts() {
        return bankAccounts;
    }

    public static IBankAccount getBankAccountByOwnerName(String ownerName) {
        AbstractBankAccount account = (AbstractBankAccount) Bank.bankInstance.bankAccounts.get(1);
        return account;
    }

}

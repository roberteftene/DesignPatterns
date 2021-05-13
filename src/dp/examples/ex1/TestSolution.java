package dp.examples.ex1;

import dp.examples.ex1.adapter.BankAccountAdapter;
import dp.examples.ex1.adapter.FutureBankAccount;
import dp.examples.ex1.adapter.IBankAccountNew;
import dp.examples.ex1.simplefactory.BankAccountFactory;
import dp.examples.ex1.simplefactory.IBankAccount;
import dp.examples.ex1.singleton.Bank;

public class TestSolution {
    public static void main(String[] args) {
        //singleton
        Bank bank = Bank.getInstance("BRD","23Dimitrie",2);
        Bank bank2 = Bank.getInstance("BdsadasRD","dsads",2);
        if(bank.equals(bank2)) {
            System.out.println("Same instance");
        } else {
            System.out.println("Different instances");
        }

        //factory
        bank.addBankAccount(BankAccountFactory.generateAccount("credit","Robert",292));
        bank.addBankAccount(BankAccountFactory.generateAccount("debit","Andrei",300));

        bank.getBankAccounts()
                .get(0)
                .transfer(BankAccountFactory.generateAccount("credit","X",400),200);

        bank.getBankAccounts()
                .get(1)
                .transfer(BankAccountFactory.generateAccount("debit","y",500),1000);
        System.out.println(bank.getBankAccounts().size());

        //adapter
         BankAccountAdapter bankAccountAdapter = new BankAccountAdapter(bank.getBankAccounts().get(1));
         IBankAccountNew accountNew = new FutureBankAccount("Andrei");
         bankAccountAdapter.accountTransfer(accountNew,200);


    }


}

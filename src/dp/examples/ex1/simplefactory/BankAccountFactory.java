package dp.examples.ex1.simplefactory;

import dp.examples.ex1.singleton.Bank;

public class BankAccountFactory {

    public static IBankAccount generateAccount(String accountType,String ownerName, double accountBalance) {
        IBankAccount account = null;
        switch (accountType) {
            case "credit":
                account = new CreditAccount(ownerName,accountBalance);
                break;
            case "debit":
                account = new DebitAccount(ownerName,accountBalance);
                break;
            default:
                throw new UnsupportedOperationException();
        }
        return account;
    }

}

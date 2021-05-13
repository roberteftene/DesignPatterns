package dp.examples.ex1.simplefactory;

public interface IBankAccount {
    void transfer(IBankAccount destination, double amount);
    void deposit(double amount);
}

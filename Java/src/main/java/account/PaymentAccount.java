package account;

public abstract class PaymentAccount {

    private final String accountHolder;
    private final int accountNumber;
    private int balance; // Add a balance property

    public PaymentAccount(String accountHolder, int accountNumber, int balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public abstract boolean pay(int amount);

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public String getAccountHolder() {
        return this.accountHolder;
    }

    public int getBalance() {
        return this.balance;
    }

    protected void updateBalance(int amount) {
        this.balance -= amount;
    }

}

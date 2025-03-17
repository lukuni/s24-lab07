package account;

public class Loan extends PaymentAccount {

    private final int minimumMonthlyPayment;

    public Loan(String accountHolder, int accountNumber, int balanceRemaining, int minimumMonthlyPayment) {
        super(accountHolder, accountNumber, balanceRemaining);
        this.minimumMonthlyPayment = minimumMonthlyPayment;
    }

    @Override
    public boolean pay(int amount) {
        if (amount < this.minimumMonthlyPayment) {
            return false; // Ensure payment meets minimum monthly payment
        }
        updateBalance(amount);
        return true;
    }

    public int getMinimumMonthlyPayment() {
        return this.minimumMonthlyPayment;
    }
}

package account;

public class DebitCard extends PaymentAccount {

    public DebitCard(String accountHolder, int accountNumber, int balance) {
        super(accountHolder, accountNumber, balance);
    }

    @Override
    public boolean pay(int amount) {
        if (this.getBalance() >= amount) {
            this.updateBalance(amount);
            return true;
        }
        return false;
    }
}

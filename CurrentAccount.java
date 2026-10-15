class CurrentAccount extends Account {
    long overdraftLimit;

    CurrentAccount(String accountNumber, String ownerName, long balance, long overdraftLimit) {
        super(accountNumber, ownerName, balance);
        this.overdraftLimit = overdraftLimit;
    }

    double interestRate() {
        return 0.0;
    }

    boolean canWithdraw(long amount) {
        return balance - amount >= -overdraftLimit;
    }
}
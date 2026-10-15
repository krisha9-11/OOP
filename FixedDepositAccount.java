class FixedDepositAccount extends Account {
    
    FixedDepositAccount(String accountNumber, String ownerName, long balance) {
        super(accountNumber, ownerName, balance);
    }

    double interestRate() {
        return 7.0;
    }

    boolean canWithdraw(long amount) {
        return false;
    }
}
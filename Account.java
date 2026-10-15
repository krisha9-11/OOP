abstract class Account {
    String accountNumber;
    String ownerName;
    long balance;

    Account(String accountNumber, String ownerName, long balance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    abstract double interestRate();

    abstract boolean canWithdraw(long amount);
}
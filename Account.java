
public class Account {
    private String accountNumber;
    private String name;
    private long balance;

    public Account(String accountNumber, String name, long balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getName() {
        return name;
    }

    public long getBalance() {
        return balance;
    }
}

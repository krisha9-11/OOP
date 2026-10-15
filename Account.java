public class Account {

    private final String accountNumber;
    private String ownerName;
    private long balance;
    private boolean active;

    private static int accountCounter = 0;

    private static String generateAccountNumber() {
        accountCounter++;
        return String.format("AC%04d", accountCounter);
    }

    public Account(String ownerName, long openingBalance) {
        this.accountNumber = generateAccountNumber();
        this.ownerName = ownerName;
        this.balance = openingBalance;
        this.active = true;
    }

    public Account(String ownerName) {
        this(ownerName, 0);
    }

    public void deposit(long amount) {
        if (amount > 0)
            balance += amount;
    }

    public boolean withdraw(long amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public long getBalance() {
        return balance;
    }

    public boolean isActive() {
        return active;
    }

    public static void main(String[] args) {

        Account[] accounts = {
            new Account("Riya", 5000),
            new Account("Aman", 3000),
            new Account("Krisha")
        };

        accounts[0].deposit(1000);
        accounts[1].withdraw(500);
        accounts[2].deposit(2000);

        for (Account account : accounts) {
            System.out.println(
                account.getAccountNumber() + " - "
                + account.getOwnerName() + " - Balance: "
                + account.getBalance()
            );
        }
    }
}



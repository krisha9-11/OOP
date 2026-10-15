public class MiniBank {
    public static void main(String[] args) {

        Account[] accounts = {
            new SavingsAccount("S101", "Amit", 5000, 1000),
            new CurrentAccount("C101", "Riya", 2000, 5000),
            new FixedDepositAccount("F101", "Jay", 10000)
        };

        for (Account a : accounts) {
            System.out.println(a.ownerName + " = " + a.interestRate() + "%");

            if (a instanceof FixedDepositAccount) {
                System.out.println("Fixed Deposit Account");
            }
        }
    }
}

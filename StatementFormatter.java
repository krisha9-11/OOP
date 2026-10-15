
public class StatementFormatter {

    public static String buildStatement(Account account) {
        StringBuilder statement = new StringBuilder();

        statement.append("----- Account Statement -----\n");
        statement.append("Account Number: ");
        statement.append(account.getAccountNumber());
        statement.append("\n");

        statement.append("Account Holder: ");
        statement.append(account.getName());
        statement.append("\n");

        statement.append("Balance: ");
        statement.append(account.getBalance());
        statement.append("\n");

        statement.append("-----------------------------");

        return statement.toString();
    }
}

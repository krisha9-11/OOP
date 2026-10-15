
public class CommandParser {

    public static Command parse(String input) {
        String[] parts = input.trim().split("\\s+");

        if (parts.length != 3) {
            return null;
        }

        try {
            TransactionType type = TransactionType.valueOf(parts[0]);
            String accountNumber = parts[1];
            long amount = Long.parseLong(parts[2]);

            if (amount <= 0) {
                return null;
            }

            if (type == TransactionType.TRANSFER) {
                return null;
            }

            return new Command(type, accountNumber, amount);

        } catch (IllegalArgumentException e) {
            return null;
        }
    }
}

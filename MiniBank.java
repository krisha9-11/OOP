public class MiniBank {

    public static void main(String[] args) {

        Account a1 = new Account("AC0001", "Riya", 4000);
        Account a2 = new Account("AC0001", "Riya", 4000);

        Customer.Address address =
                new Customer.Address("Main Road", "Anand", "388001");

        Customer customer =
                new Customer("Riya", "riya@gmail.com", "9876543210", address);

        System.out.println(a1);

        System.out.println("a1 equals a2: " + a1.equals(a2));

        System.out.println("a1 is Account: " + (a1 instanceof Account));

        System.out.println("Address: "
                + customer.getAddress().getLine() + ", "
                + customer.getAddress().getCity() + ", "
                + customer.getAddress().getPincode());

        Customer copy = customer.clone();

        System.out.println("Customer cloned: " + (copy != null));
    }
}3
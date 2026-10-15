import java.util.Scanner;

public class TollBooth {

    record Vehicle(String number, String type) {}

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int bikes = 0;
        int cars = 0;
        int trucks = 0;
        int total = 0;

        while (true) {

            System.out.print("Enter vehicle number (or done): ");
            String number = sc.next();

            if (number.equalsIgnoreCase("done")) {
                break;
            }

            System.out.print("Enter type (bike/car/truck): ");
            String type = sc.next().toLowerCase();

            Vehicle vehicle = new Vehicle(number, type);

            switch (vehicle.type()) {
                case "bike" -> {
                    bikes++;
                    total += 20;
                }
                case "car" -> {
                    cars++;
                    total += 50;
                }
                case "truck" -> {
                    trucks++;
                    total += 150;
                }
                default -> System.out.println("Invalid vehicle type");
            }
        }

        System.out.println("\nTotal toll = ₹" + total);

        if (bikes >= cars && bikes >= trucks)
            System.out.println("Most frequent = Bike");
        else if (cars >= trucks)
            System.out.println("Most frequent = Car");
        else
            System.out.println("Most frequent = Truck");

        sc.close();
    }
}
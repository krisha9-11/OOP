public class PayrollDriver {
    public static void main(String[] args) {

        Employee[] employees = {
            new FullTime("Amit", 1, 50000),
            new PartTime("Riya", 2, 80, 300),
            new Intern("Jay", 3, 10000)
        };

        double total = 0;

        for (Employee e : employees) {
            double salary = e.monthlySalary();

            System.out.println(e.name + " = " + salary);

            if (e instanceof Intern) {
                System.out.println("This is an intern.");
            }

            total = total + salary;
        }

        System.out.println("Total Salary = " + total);
    }
}
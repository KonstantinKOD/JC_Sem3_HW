package tasks;

public class Director extends Employee{
    public Director(String firstname, int age, String post, String phoneNumber, double salary) {
        super(firstname, age, "Директор", phoneNumber, salary);
    }

    public static void upSalary(Employee[] employees) {
        for (Employee employee : employees) {
            if (employee.getAge() > 45 && !employee.getPost().equals("Директор"))
                employee.setSalary(employee.getSalary() + 5000);
        }
    }
}

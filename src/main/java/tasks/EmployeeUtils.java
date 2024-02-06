package tasks;

public class EmployeeUtils {
    public static void upSalary(Employee[] employees) {
        for (Employee employee : employees) {
            if (employee.getAge() > 45) employee.setSalary(employee.getSalary() + 5000);
        }
    }
}
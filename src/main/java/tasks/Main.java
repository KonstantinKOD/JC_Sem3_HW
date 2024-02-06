package tasks;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("John", 30, "Manager", "12345678901", 21415),
                new Employee("Bob", 50, "IceCreamMan", "12345678901", 345),
                new Employee("Victor", 25, "Programmer", "12345678901", 456),
                new Employee("Hanna", 47, "Developer", "12345678901", 567),
                new Employee("Lizzy", 70, "Tester", "12345678901", 678)};

        System.out.println(Arrays.toString(employees));
        EmployeeUtils.upSalary(employees);
        System.out.println(Arrays.toString(employees));
    }

}
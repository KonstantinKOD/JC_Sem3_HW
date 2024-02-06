package tasks;

import java.util.Comparator;

public class Employee implements Comparable<Employee> {
    private String firstname;
    private int age;
    private String post;
    private String phoneNumber;
    private double salary;

    public Employee(String firstname, int age, String post, String phoneNumber, double salary) {
        this.firstname = firstname;


        this.age = age;
        this.post = post;
        this.phoneNumber = phoneNumber;
        this.salary = salary;

    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstname='" + firstname + '\'' +
                ", age=" + age +
                ", post='" + post + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", salary=" + salary +
                '}';
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getPost() {
        return post;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee o) {
        int res = this.getPost().compareTo(o.getFirstname());
        return res;
    }
}

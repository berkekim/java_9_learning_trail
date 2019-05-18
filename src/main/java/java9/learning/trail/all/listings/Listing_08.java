package java9.learning.trail.all.listings;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class Listing_08 {

    static class Employee {
        private String firstName;
        private String lastName;
        private double salary;
        private String department;

        public Employee(String firstName, String lastName, double salary, String department) {

            this.firstName = firstName;
            this.lastName = lastName;
            this.salary = salary;
            this.department = department;

        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }

        public String getDepartment() {
            return department;
        }

        public void setDepartment(String department) {
            this.department = department;
        }

        public String getName() {
            return String.format("%s %s", getFirstName(), getLastName());
        }

        @Override
        public String toString() {
            return String.format("%-8s %-8s %-8.2f %-8s", getFirstName(), getLastName(), getSalary(), getDepartment());
        }

    }

    public static void main(String[] args) {

        Listing_08.Employee[] employees = {
                new Employee("Jason", "Red", 5000, "IT"),
                new Employee("Ashley", "Green", 7600, "IT"),
                new Employee("Matthew", "Indigo", 3587.5, "Sales"),
                new Employee("James", "Indigo", 4700.77, "Marketing"),
                new Employee("Luke", "Indigo", 6200, "IT"),
                new Employee("Jason", "Blue", 3200, "Sales"),
                new Employee("Wendy", "Brown", 4236.4, "Marketing")
        };

        List<Employee> list = Arrays.asList(employees);

        System.out.println("Complete employee list:");
        list.stream().forEach(System.out::println);

        Predicate<Employee> predicate = employee -> (employee.getSalary() >= 4000.0 && employee.getSalary() <= 6000.0);
        System.out.printf("%nEmployees earning $4000-$6000 per month sorted by salary: %n");
        list.stream()
                .filter(predicate)
                .sorted(Comparator.comparing(Employee::getSalary))
                .forEach(System.out::println);

    }

}

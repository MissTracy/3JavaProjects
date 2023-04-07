package EmployeeTaxCalculator;

public class Employee {
    private final String name;
    private final int number;
    private final double salary;

    public Employee(String name, int number, double salary) {
        this.name = name;
        this.number = number;
        this.salary = salary;
    }

    public double calculateTax() {
        double tax = 0.0;
        if (salary > 40000) {
            tax = salary * 0.25;
        } else if (salary > 20000) {
            tax = salary * 0.20;
        } else if (salary > 10000) {
            tax = salary * 0.10;
        }
        return tax;
    }

    public double getTaxPercentage() {
        double taxPercentage = 0.0;
        if (salary > 40000) {
            taxPercentage = 0.25;
        } else if (salary > 20000) {
            taxPercentage = 0.20;
        } else if (salary > 10000) {
            taxPercentage = 0.10;
        }
        return taxPercentage;
    }

    public void displayEmployeeInfo() {
        System.out.println("Name: " + name);
        System.out.println("Number: " + number);
        System.out.println("Salary: R" + salary);
        System.out.println("After Tax: R" + (salary - calculateTax()));
        System.out.println("Tax Value: " + getTaxPercentage() * 100 + "%");
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee("Lisa", 3526,12000);
        employee1.displayEmployeeInfo();

    }
}
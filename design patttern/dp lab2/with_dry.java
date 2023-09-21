/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp_lb_2;

/**
 *
 * @author fa20-bse-036
 */
class Employee {
    private String name;
    private int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public void displayInfo() {
        System.out.println("Employee: " + name + ", Salary: $" + salary);
    }
}

public class with_dry {
    public static void main(String[] args) {
        Employee employee1 = new Employee("John Doe", 50000);
        Employee employee2 = new Employee("Jane Smith", 60000);

        employee1.displayInfo();
        employee2.displayInfo();
    }
}


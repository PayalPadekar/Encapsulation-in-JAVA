package com.encapsulation;

public class testencapsulation {
    public static void main(String[] args) {
        try {
            // Creating an Employee object using the constructor
            Employee emp = new Employee(101, "Alice Johnson", 30, 50000);

            // Displaying employee details
            emp.display();

            // Updating age and salary
            System.out.println("\nUpdating Employee Age and Salary...");
            emp.setAge(25); // Valid age
            emp.setSalary(55000); // Valid salary

            // Display updated details
            emp.display();

            // Invalid updates
            System.out.println("\nAttempting Invalid Updates...");
            emp.setAge(15); // Invalid age
            emp.setSalary(-1000); // Invalid salary
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
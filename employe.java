package com.encapsulation;

class Employee {
    // Private fields (Encapsulation)
    private int id;
    private String name;
    private int age;
    private double salary;

    // Constructor to initialize employee details
    public Employee(int id, String name, int age, double salary) {
        this.id = id;
        this.name = name;

        if (age > 18) {
            this.age = age;
        } else {
            System.out.println("Age must be greater than 18.");
        }

        if (salary > 0) {
            this.salary = salary;
        } else {
        	System.out.println("Salary must be greater than 0.");
        }
    }

    // Getter methods
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    // Setter methods with validation
    public void setAge(int age) {
        if (age > 18) {
            this.age = age;
        } else {
            System.out.println("Error: Age must be greater than 18.");
        }
    }

    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("Error: Salary must be greater than 0.");
        }
    }

    // Method to display employee details
    public void display() {
        System.out.println("\nEmployee Details:");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }
}

import java.util.Scanner;

public class Employee extends Person{
      // 1.4 page-2 Create a subclass Employee that inherits from Person and adding attributes employeeId, salary

      int employeeId;
      int salary;

      // Parameterized constructor
      Employee(int employeeId, int salary, String name, int age){

            super(name,age);
            this.employeeId = employeeId;
            this.salary = salary;
      }

      // Main method
      public static void main(String[] args) {
            // Instruction to user
            System.out.println("Write a Employee details following format :");
            System.out.println("Name , Age , Empolyee Id , Salary ");

            // Get Details from user
            Scanner scanner = new Scanner(System.in);
            String name = scanner.next();
            int age = scanner.nextInt();
            int employeeId = scanner.nextInt();
            int salary = scanner.nextInt();

            Employee personDetails = new Employee(employeeId, salary, name, age);
            // Display the user details
            System.out.println("Employee Name : " + personDetails.name); // Employee Name : Name
            System.out.println("Employee Age : " + personDetails.age); // Employee age : Age
            System.out.println("Employee ID : " + personDetails.employeeId); // Employee ID : ID Number
            System.out.println("Employee Salary : " + personDetails.salary); // Employee Salary : Salary
      }
}

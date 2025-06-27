package task.two.question4;

import java.util.Scanner;

public class Employee extends Person {
      // 1.4 page-2 Create a subclass task.two.question4.Employee that inherits from task.two.question4.Person and adding attributes employeeId, salary

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
            System.out.println("Write a task.two.question4.Employee details following format :");
            System.out.println("Name , Age , Empolyee Id , Salary ");

            // Get Details from user
            Scanner scanner = new Scanner(System.in);
            String name = scanner.next();
            int age = scanner.nextInt();
            int employeeId = scanner.nextInt();
            int salary = scanner.nextInt();

            Employee personDetails = new Employee(employeeId, salary, name, age);
            // Display the user details
            System.out.println("task.two.question4.Employee Name : " + personDetails.name); // task.two.question4.Employee Name : Name
            System.out.println("task.two.question4.Employee Age : " + personDetails.age); // task.two.question4.Employee age : Age
            System.out.println("task.two.question4.Employee ID : " + personDetails.employeeId); // task.two.question4.Employee ID : ID Number
            System.out.println("task.two.question4.Employee Salary : " + personDetails.salary); // task.two.question4.Employee Salary : Salary
      }
}

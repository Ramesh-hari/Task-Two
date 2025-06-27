package task.two;

import java.util.Scanner;

public class Person {
        // 1.1 Create a class person with properties(name and age)?

        String name;
        int age;

        // Default constructor
        // a. Default age of person should be 18
        Person() {
            age = 18;
        }

        // Parameterized constructor
        // b. A person object can be initialized with name and age
        Person(String _name, int _age) {
            name = _name;
            age = _age;
        }

        // c. Method to display name and age of the person
        void displayInfo() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
        }

        // Main method
        public static void main(String[] args) {
            Person sample = new Person();
            int num = sample.age;

            // Instruction to user
            System.out.println("Write a name :");

            // Get input from user
            Scanner input1 = new Scanner(System.in);
            String inputName = input1.next();

            Person person = new Person(inputName,num);
            // Display the details
            person.displayInfo(); //Output: User input name and input age

        }
    }



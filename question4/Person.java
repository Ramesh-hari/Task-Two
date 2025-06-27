package task.two.question4;

import java.util.Scanner;

public class Person {
      // 1.4 page-1 Define a base class task.two.question4.Person with attributes name, age

      String name ;
      int age ;

      // Parameterized constructor
      Person(String name, int age){
          this.name = name;
          this.age = age;
      }

      // Main method
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        int age = scanner.nextInt();

        Person person = new Person(name , age);
    }
}

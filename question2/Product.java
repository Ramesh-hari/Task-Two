package task.two.question2;

public class Product {
    // 1.2 Page-1 : Create a class Product (pid,price,quantity) with parameterized constructor?

    int pid ;
    int price;
    int quantity;

    // Parameterized constructor
    Product(int pid, int price, int quantity){
         this.pid  = pid;
         this.price = price;
         this.quantity = quantity;
    }
}

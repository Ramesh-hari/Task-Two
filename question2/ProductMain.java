package task.two.question2;

import java.util.Scanner;

public class ProductMain {
          // 1.2 Page-2 : Create a class ProductMain and performing a,b,c task?

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Product[] products = new Product[5];


        // a. Accept product information from user
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter Products Details Based on Following Format");
            System.out.print("Product Id No. " + (i + 1) + " : ");
            int pid = scanner.nextInt();
            System.out.print("Product Price : ");
            int price = scanner.nextInt();
            System.out.print("Product Quantity : ");
            int quantity = scanner.nextInt();

            products[i] = new Product(pid, price, quantity);
        }

        // b. Find the pid of product with the highest price
        int highestPricePid = findHighestPricePid(products);
        System.out.println(); // Give space for display the output
        System.out.println(); // Give space for display the output
        System.out.println("Product ID with the highest price: " + highestPricePid);
        // Output - Product ID with the highest price: 2

        // Calculate and print total amount spent
        double totalAmountSpend = findTotalAmountSpend(products);
        System.out.println("Total amount spent for all products: " + totalAmountSpend);
        // Output - Total amount spent for all products: 2000
    }

    // Method used for find pid of product with the highest price
    public static int findHighestPricePid(Product[] products) {

        int pid = 0;
        double highestPrice = 0;

        for (Product product : products) {
            if (product.price > highestPrice) {
                highestPrice = product.price;
                pid = product.pid;
            }
        }
        return pid;
    }

    // Method used for calculate total amount spend for all products
    public static double findTotalAmountSpend(Product[] products) {

        double totalAmountspend = 0;

        for(Product product : products){
            totalAmountspend = product.price * product.quantity;
        }
        return totalAmountspend;
    }
}


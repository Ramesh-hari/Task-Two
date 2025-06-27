package task.two.question3;

import java.util.Scanner;

public class Account {
    // 1.3 Create a class task.two.question3.Account with data member as balance and Perform following tasks a,b,c

    // Data member
    double balance;
    double deposit;
    double withdraw;

    // No argument or Default constructor
    Account(){
        this.balance = 0.0;
    }

    // With argument or Parameterized constructor
    Account(double deposit, double withdraw){
        this.deposit = deposit;
        this.withdraw = withdraw;
    }

    // Main method
    public static void main(String[] args) {
        Account initialBalance = new Account();
        // Display the initial account balance amount
        System.out.println("Your current account balance : " + initialBalance.balance);

        // Get input values from user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the deposit amount : ");
        double deposit = scanner.nextDouble();
        System.out.print("Enter the withdraw amount : ");
        double withdraw = scanner.nextDouble();
        Account amount = new Account(deposit, withdraw);

        amount.deposit(amount);
        amount.withdraw(amount);
        amount.displayBalance(amount);

    }

    // a. Method to deposit the amount to account
    public void deposit(Account amount) {
        if(amount.deposit > 0){
            this.balance += amount.deposit;
            System.out.println("Your deposited amount : " + amount.deposit + " and Your current balance : " + this.balance);
        }
        else{
            System.out.println("Please deposit amount greater than 0");
        }
    }

    // b. Method to withdraw the amount from account
    public void withdraw(Account amount) {
        if(amount.withdraw < amount.deposit){
            this.balance -= amount.withdraw;
            System.out.println("Your withdrawn amount : " + amount.withdraw + " and Your current balance : " + this.balance);
        }
        else{
            System.out.println("Insufficient balance");
        }
    }

    // c. Method to display balance
    public void displayBalance(Account amount) {
        System.out.println("Your task.two.question3.Account current balance : " + this.balance);
    }
    // Output: Your task.two.question3.Account current balance : Display user account balance
}
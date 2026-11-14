//parent class
class BankAccount {
    // private variables
    private String Accountdetails;
    private String name;
    private double balance;

    // constructor
    public BankAccount(String Accountdetails, String name, double balance) {
        this.Accountdetails = Accountdetails;
        this.name = name;
        this.balance = balance;
    }

    // getter method-its used to allow access to private variables
    public String getAccountdetails() {
        return Accountdetails;
    }

    public String getname() {
        return name;
    }

    public double getbalance() {
        return balance;
    }

    // setters are used to set values of private variables
    public void setname(String name) {
        this.name = name;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        }
    }

    // Method overloading
    public void deposit(double amount, String description) {
        deposit(amount);
        System.out.println("Description:" + description);
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn:" + amount);
        } else {
            System.out.println("Invalid amount or Insufficient balance");
        }
    }

    // overlading withdraw
    public void withdraw(double amount, String description) {
        withdraw(amount);
        System.out.println("Reason for withdrawal:" + description);
    }

    // Method to display details
    public void display() {
        System.out.println("Account Details:" + Accountdetails);
        System.out.println("AccountName:" + name);
        System.out.println("Balance: " + balance);
    }
}

public class Main {
    public static void main(String[] args) {
        // Create bank account object
        BankAccount account = new BankAccount("AFK0908", "Ayeyi Adams", 30500);
        // Diplay account details
        account.display();

        // Access private variables using getters
        System.out.println("Owner: " + account.getname());
        // Update private variable using setter
        account.setname("Grace Mensah");
        // Method overloading (Deposit)

        account.deposit(30000);
        account.deposit(500, "Monthly Savings");

        // Method overloading withdraw
        account.withdraw(570);
        account.withdraw(2050, "Shopping");

        // Display updated account info
        account.display();
    }
}
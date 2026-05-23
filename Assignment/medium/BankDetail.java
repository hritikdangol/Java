import java.util.Scanner;
class Bank {
    String accountHolderName;
    String accountNumber;
    double balance;

    Scanner sc = new Scanner(System.in);

    Bank(String ah, String an, double b) {
        this.accountHolderName = ah;
        this.accountNumber = an;
        this.balance = b;
    }

    void deposit() {
        System.out.print("Enter amount to deposit: ");
        double amount = sc.nextDouble();

        if (amount > 0) {
            balance += amount;
            System.out.println("Amount Deposited: " + amount);
        } else {
            System.out.println("Invalid");
        }
    }

    void withdraw() {
        System.out.print("Enter amount to withdraw: ");
        double amount = sc.nextDouble();

        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Amount Withdrawn: " + amount);
        } else {
            System.out.println("Invalid");
        }
    }

    void showDetails() {
        System.out.println("Name: " + accountHolderName);
        System.out.println("Account No: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

public class BankDetail {
    public static void main(String[] args) {

        Bank b1 = new Bank("Hrithik", "08004979774", 5000);

        b1.showDetails();
        b1.deposit();
        b1.withdraw();

        b1.showDetails();
    }
}
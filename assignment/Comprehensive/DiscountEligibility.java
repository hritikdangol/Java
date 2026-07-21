import java.util.Scanner;

class Customer {

    private String name;
    private boolean member;
    private double purchaseAmount;
    private double finalAmount;

    Customer(double pa) {
        this.purchaseAmount = pa;
    }

    void setName(String name) {
        this.name = name;
    }
    String getName() {
        return name;
    }
    void setMember(boolean member) {
        this.member = member;
    }
    boolean isMember() {
        return member;
    }
    void calculateDiscount() {
        if (member==true && purchaseAmount >1000) {
            finalAmount = purchaseAmount - (purchaseAmount * 0.15);
        } else {
            finalAmount = purchaseAmount;
        }
    }
    void display() {
        System.out.println("Customer Name: " + getName());
        System.out.println("Member: " + isMember());
        System.out.println("Purchase Amount: " + purchaseAmount);
        System.out.println("Final Amount Payable: " + finalAmount);
    }
}

public class DiscountEligibility {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Customer Name: ");
        String name = sc.nextLine();
        System.out.print("Is the customer a member? (true/false): ");
        boolean isMember = sc.nextBoolean();
        System.out.print("Enter Purchase Amount: ");
        double amount = sc.nextDouble();
        Customer c1 = new Customer(amount);
        c1.setName(name);
        c1.setMember(isMember);
        c1.calculateDiscount();
        c1.display();
        sc.close();
    }
}
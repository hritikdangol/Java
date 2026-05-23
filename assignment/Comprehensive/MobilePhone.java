import java.util.Scanner;   
public class MobilePhone {
    public String brand;
    public String model;
    private double price;
    MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
    void setPrice(double price) {
        this.price = price;
    }
    double getPrice() {
        return price;
    }
    void displaydetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: $" + price);
    }
    
}
class details{
    public static void main(String[] args) {
        MobilePhone m1 = new MobilePhone("Apple", "iPhone 13", 999.99);
        m1.displaydetails();
        System.out.println("Enter your desired price: ");
        Scanner sc = new Scanner(System.in);
        double newPrice = sc.nextDouble();
        m1.setPrice(newPrice);
        System.out.println("Updated Price: $" + m1.getPrice());
        sc.close();
    }
}
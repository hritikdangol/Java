import java.util.Scanner;
public class Ticket {
    String passengerName;
    String travelClass;
    double basePrice;
    double finalPrice;
    Ticket(String pn, String tc, double bp) {
        this.passengerName = pn;
        this.travelClass = tc;
        this.basePrice = bp;
    }
    void calculatePrice() {
        switch (travelClass.toLowerCase()) {
            case "economy":
                finalPrice = basePrice;
                break;
            case "business":
                finalPrice = basePrice + (basePrice * 0.30);
                break;
            case "first":
                finalPrice = basePrice + (basePrice * 0.50);
                break;
            default:
                System.out.println("Invalid travel class!");
                finalPrice = basePrice;
        }
    }

    void display() {
        System.out.println("Passenger Name: " + passengerName);
        System.out.println("Travel Class: " + travelClass);
        System.out.println("Base Price: " + basePrice);
        System.out.println("Final Price: " + finalPrice);
    }
}

 class Airline {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
     System.out.print("Enter passenger name: ");
        String name = sc.nextLine();
        System.out.print("Enter travel class (Economy/Business/First): ");
        String travelClass = sc.nextLine();
        System.out.print("Enter base price: ");
        double basePrice = sc.nextDouble();
        Ticket t1 = new Ticket(name, travelClass, basePrice);
        Ticket t2 = new Ticket("Alice", "Business", 500);
        Ticket t3 = new Ticket("Bob", "First", 800);
        t1.calculatePrice();
        t2.calculatePrice();
        t3.calculatePrice();
        t1.display();
        t2.display();
        t3.display();
        sc.close();
    }
}
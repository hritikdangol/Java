public class Showroom {
    String brand;
    String model;
    double price;
    Showroom(String b, String m, double p) {
        this.brand=b;
        this.model=m;
        this.price=p;
    }
    void displayCar()
    {
        if(price>=2000000)
        {
            System.out.println("Brand: "+brand);
            System.out.println("Model: "+model);
            System.out.println("Price: "+price);
        }
        else
        {
            System.out.println("No car availablein this price");
        }
    }
}
class Car{
    public static void main(String[] args)
    {
        Showroom s1= new Showroom("BMW","X5",5000000);
        Showroom s2= new Showroom("OMODO","Swift",800000);
        Showroom s3= new Showroom("Audi","A4",1500000);
        Showroom s4= new Showroom("TOYOTA","i20",900000);
        Showroom s5= new Showroom("Mercedes","C-Class",4000000);
        s1.displayCar();
        s2.displayCar();
        s3.displayCar();
        s4.displayCar();
        s5.displayCar();
    }
}

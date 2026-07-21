class CarDetails{
        String brand;
        int year;
        CarDetails(String b, int y)//constructor
        {
            this.brand=b;
            this.year=y;
        }
        void displaycar()
        {
            System.out.println("Brand: "+brand);
            System.out.println("Year: "+year);
        }
    }
public class Main {
    public static void main(String[] args)
    {
        CarDetails car1=new CarDetails("TATA", 2025);
        CarDetails car2=new CarDetails("OMODO", 2026);
        car1.displaycar();
        car2.displaycar();
    }
}
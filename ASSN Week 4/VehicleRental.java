class Vehicle {
    public String plateNumber;
    private double baseRate;
    Vehicle(String pn, double br){
        this.plateNumber=pn;
        this.baseRate=br;
    }
    public void setbaseRate(double baseRate){
        this.baseRate=baseRate;
    }
    double getbaseRate(){
        return baseRate;
    }
    void calculateRental(int days){
        System.out.println("Your rent is :");
    }
}
class car extends Vehicle{
    car(String pn, double br)
    {
        super(pn,br);
    }
    @Override
    void calculateRental(int days){
        double rental = getbaseRate() * days;
        System.out.println("Your rent is : " + rental);
    }
}
class Truck extends Vehicle{
    double loadfee;
    Truck(String pn, double br, double lf)
    {
        super(pn,br);
        this.loadfee=lf;
    }
    @Override
    void calculateRental(int days){
        double rental = getbaseRate() * days*loadfee;
        System.out.println("Your rent is : " + rental);
    }
}
class bike extends Vehicle{
    bike(String pn, double br)
    {
        super(pn,br);
    }
    @Override
    void calculateRental(int days){
        double rental = getbaseRate();
        System.out.println("Bike rent is fixed so your rent is : " + rental);
    }
}
public class VehicleRental{
    public static void main(String[] args){
        car c1=new car("BA2650",1200);
        Truck t1=new Truck("BA 26 Pa150",2100,500);
        bike b1=new bike("BA2650",800);
        c1.calculateRental(5);
        t1.calculateRental(6);
        b1.calculateRental(7);
    }
}
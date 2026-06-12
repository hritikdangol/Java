class Product{
    String name;
    double price;
    Product(String n, double p)
    {
        this.name=n;
        this.price=p;
    }
    void displayDetails(){
        System.out.println("DETAILS:"+ name + "\n" +price);
    }
}
 class Electronics extends Product{
    String warrantyPeriod;
    Electronics(String n,double p, String wp){
        super(n,p);
        this.warrantyPeriod=wp;
    }
    @Override
    void displayDetails()
    {
            System.out.println("DETAILS:" + name + "\n" + price + "\n" + warrantyPeriod);
    }
 }
 class Clothing extends Product{
    String size;
    String material;
     Clothing(String n,double p, String s, String m){
        super(n,p);
        this.size=s;
        this.material=m;
    }
     @Override
    void displayDetails()
    {
            System.out.println("DETAILS:" + name + "\n" + price + "\n" + size+"\n"+material);
    }   
 }
  class Grocery extends Product{
String expiryDate;
     Grocery(String n,double p, String e){
        super(n,p);
        this.expiryDate=e;
    }
     @Override
    void displayDetails()
    {
            System.out.println("DETAILS:" + name + "\n" + price + "\n" + expiryDate);
    }   
 }
public class ProductCatalog{
    public static void main(String[] args)
    {
        Electronics e1= new Electronics("Fan",3000,"2Y");
        Clothing c1=new Clothing("Sweater",2500, "XL","Cotton");
        Grocery g1= new Grocery("Lays",50,"2026/06/10");
        e1.displayDetails();
        c1.displayDetails();
        g1.displayDetails();
    }
}
public class DiscountCalculator {
    String ProductName;
    double price;
    double discountPercentage;

    DiscountCalculator(String Pn, String p, double dp)
    {
        ProductName = Pn;
        price = Double.parseDouble(p);
        discountPercentage = dp;
    }
    void calculateFinalPrice()
    {

        System.out.println("Name: "+ProductName);
        System.out.println("Actual price:"+ price);
        price=price-(price*discountPercentage/100);
        System.out.println("Discount Percentage: "+discountPercentage+"%"); 
        System.out.println("Final Price: "+price);
    }
}
 class discount{
    public static void main(String[] args){
        DiscountCalculator d1= new DiscountCalculator("Laptop", "1002000.0", 20.0);
        DiscountCalculator d2= new DiscountCalculator("Iphone", "50000.0", 9.0);
        DiscountCalculator d3= new DiscountCalculator("Graphic card", "40000.0", 13.0);
        d1.calculateFinalPrice();
        d2.calculateFinalPrice();
        d3.calculateFinalPrice();
    }
}
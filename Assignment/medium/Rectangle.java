import java.util.Scanner;
public class Rectangle {
    double length;
    double breadth;
     Rectangle(double l, double b) {
        this.length = l;
        this.breadth = b;
    }
    void calculateArea(){
        double area;
        area=length*breadth;
        System.out.println("Area of Rectangle: "+area);
    }
    
}
 class RectangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<3;i++){
        System.out.print("Enter length for rectangle : " + (i+1) + ": ");   
        double length = sc.nextDouble();
        System.out.print("Enter breadth for rectangle : " + (i+1) + ": ");
        double breadth = sc.nextDouble();

        Rectangle r1 = new Rectangle(length, breadth);
        r1.calculateArea();
    }
    sc.close();
}
}

import java.util.Scanner;
public class Circle {
    final double PI=3.14;
    double radius;
    Circle(double r)
    {
        radius=r;
    }

    void calculateCircumference()
    {
        double circumference=2*PI*radius;
        System.out.println("Circumference: "+circumference);
    }
    void calculateArea()
    {
        double area=PI*radius*radius;
        System.out.println("Area: "+area);
    }
}
class calculation{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        for(int i=0;i<2;i++){
        System.out.print("Enter radius of circle: ");
        double radius= sc.nextDouble();
        Circle c1= new Circle(radius);
        c1.calculateCircumference();
        c1.calculateArea();
    }
    sc.close();
    }
}

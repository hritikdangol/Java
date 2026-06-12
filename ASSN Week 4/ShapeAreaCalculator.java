import java.util.Scanner;
abstract class Shape{
    abstract double calculateArea();
    final double PIE=3.14;
    void display(){
        System.out.println("Area:"+ calculateArea());
    }
}
class Rectangle extends Shape{
    double length,width;
    Rectangle(double l, double w){
        this.length=l;
        this.width=w;
    }
    @Override 
    double calculateArea(){
        double result=length*width;
        return result;
    }
    @Override
    void display()
    {
        System.out.println("Area of rectangle" + calculateArea());
    }
}
class Circle extends Shape{
    double radius;
    Circle(double r){
        this.radius=r;
    }
    @Override 
    double calculateArea(){
        double result=PIE*radius*radius;
        return result;
    }
        @Override
    void display()
    {
        System.out.println("Area of circle" + calculateArea());
    }
}
class Triangle extends Shape{
    double base,height;
    Triangle(double b, double h){
        this.base=b;
        this.height=h;
    }
    @Override 
    double calculateArea(){
        double result=(base*height)/2;
        return result;
    }
        @Override
    void display()
    {
        System.out.println("Area of triangle" + calculateArea());
    }    
    }
public class ShapeAreaCalculator{
    public static void main(String[] args){
        int i = 0;
        Scanner sc= new Scanner(System.in);;
        System.out.println("Enter a length");
        double length=sc.nextDouble();
        System.out.println("Enter a width");
        double width=sc.nextDouble();
        System.out.println("Enter a radius");
        double radius=sc.nextDouble();
        System.out.println("Enter a base");
        double base=sc.nextDouble();
        System.out.println("Enter a height");
        double height=sc.nextDouble();
        Shape[] a1= new Shape[3];
        a1[0]= new Rectangle(length,width);
        a1[1]=new Circle(radius);
        a1[2]=new Triangle(base,height);
        double totalarea=0;
        for(i=0;i< a1.length;i++)
        {
            a1[i].display();
            totalarea +=a1[i].calculateArea();
        }
        System.out.println("Totalarea" +totalarea);
        sc.close();
    }
}


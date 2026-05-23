import java.util.Scanner;
public class PositiveNegative {
    public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    System.out.print("Enter the number: ");
    double n1= sc.nextDouble();
    if(n1>0)
    {
        System.out.println("The number is positive");
    }
    else if(n1<0)
    {
        System.out.println("The number is negative");
    }
    else
    {
        System.out.println("The number is zero");
    }
    sc.close();
    }
}

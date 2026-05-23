import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    System.out.print("Enter first number: ");
    double n1=sc.nextDouble();
    System.out.print("Enetr second number: ");
    double n2=sc.nextDouble();
    System.out.println("Enter operator (+, -, *, /)");
    char op=sc.next().charAt(0);
    switch (op) {
    case'+' :
    double result=n1+n2;
    System.out.println("Addition: "+ result);
    break;
    case '-':
        result=n1-n2;
        System.out.println("Subtration: "+ result);
        break;
    case '*':
        result=n1*n2;
        System.out.println("Multiplication: "+ result);
        break;
        case '/':
            if(n2==0)
            {
                System.out.print("Not divisible by 0");
            }
            else
            {
                result=n1/n2;
                System.out.println("Division: "+result);
            }
            break;
            default:
                System.out.println("Enter valid operator");
    }
    sc.close();
    } 
}
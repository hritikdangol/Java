import java.util.Scanner;
public class Greatest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      System.out.print("Enter first number: ");
      int n1 = sc.nextInt();
        System.out.print("Enter second number: ");  
        int n2 = sc.nextInt();
        if(n1>n2)
        {
            System.out.println(n1 + "is greatest");
        }
        else
        {
            System.out.println(n2 + "is greatest");
        }
        sc.close();
    }
}

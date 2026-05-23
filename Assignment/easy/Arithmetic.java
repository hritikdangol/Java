public class Arithmetic{
    public static void main(String[] args) {
        int a=10;
        int b=0;
        int sum= a+b;
        int difference= a-b;
        int product= a*b;
        System.out.println(" Sum: "+ sum);
        System.out.println(" Difference: "+ difference);
        System.out.println(" Product: " + product);
        if(b!=0)
        {
            int quotient = a / b;
            System.out.println("Quotient: " + quotient);
        }
        else
        {
            System.out.print("   Invalid Division");
        }
    }
}
import java.util.Scanner;
public class Vote  {
    public static void main (String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the age:");
        int age= sc.nextInt();

        if (age<18)
        {
            System.out.println("Not Eligible");
        }
        else
            {
            System.out.print("Are you a citizen (true/false): ");
        boolean votercard= sc.nextBoolean();
        if(age>=18 && votercard==true)
            {
                System.out.println("Eligible");
            }
            else if( age>=18 && votercard==false)
                {
                    System.out.println("make votercard");
                }
                else
                {
                    System.out.println("Not Eligible");
                }
     }
    sc.close();
    }
}
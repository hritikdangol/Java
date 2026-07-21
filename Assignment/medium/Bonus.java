import java.util.Scanner;
public class Bonus {
    String name;
    double salary;
    double experience;
    Scanner sc= new Scanner(System.in);
     Bonus() ///constructor without parameter 
     {
     System.out.print("Enter name: ");
    name= sc.nextLine();
    System.out.print("Enter salary: ");
    salary= sc.nextDouble();
    System.out.print("Enter years of experience: ");
    experience= sc.nextDouble();
     }
    void calculatebonus(){
                double bonus;
                if(experience>5){
                    bonus=salary*(0.20);
                    salary=salary+bonus;
                    System.out.println("Bonus: "+bonus);
                    System.out.println("Total Salary: "+salary);
                }
                else
                {
                    bonus=salary*(0.10);
                    salary=salary+bonus;
                    System.out.println("Bonus: "+bonus);
                    System.out.println("Total Salary: "+salary);
                }
                sc.close();
            }
}
class Bonusdetails{
    public static void main(String [] args){
            Bonus b1= new Bonus();
        b1.calculatebonus();
    }
}

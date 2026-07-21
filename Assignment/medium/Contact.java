import java.util.Scanner;
public class Contact {
String name;
String phoneNumber;
String emailAddress;
Scanner sc= new Scanner(System.in);
Contact(String n, String p, String e)
{
    name=n;
    phoneNumber=p;
    emailAddress=e;
}
{

}
      void displaycontact()
      {
        if(!emailAddress.isEmpty())
            {
            System.out.println("Name: "+name);
            System.out.println("Phone Number: "+phoneNumber);
            System.out.println("Email Address: "+emailAddress);
        }
        else
        {
            System.out.println("No complete details of" + name);
        }
        sc.close();
      }

    }    
class DetailContact{
    public static void main(String[] args)
    {
        Contact c1= new Contact("Hrithik","9860641089","hritikdango@gmail.com");
        Contact c2= new Contact("Ranil","9876543210","null");
        Contact c3= new Contact("Kushal","9876543210","kushal@gmail.com");
        c1.displaycontact();
        c2.displaycontact();
        c3.displaycontact();
    }
}

import java.util.Scanner;
class Employee{
    private String name;
    private int id;
    double baseSalary;

    Employee(String n, int i){
        this.name=n;
        this.id=i;
    }
    public void setname(String name){
        this.name=name;
    }
    public String getname(){
        return name;
    }
    public void setid(int id){
        this.id=id;
    }
    public int getid(){
        return id;
    }
    void calculateSalary(){
        System.out.println("Your Salary is:"+baseSalary);
    }
}
class manager extends Employee{
     private double bonus; 
    manager(String n, int i, double b){
        super(n,i);
        this.bonus=b;
    }
    public void setbonus(double bonus){
        this.bonus=bonus;
    }
    double getbonus(){
        return bonus;
    }
    @Override
    void calculateSalary()
    {
        double Salary=baseSalary+bonus;
        System.out.println("Manager Salary:"+Salary);
    }   
}
class developer extends Employee{
     private int overtime; 
     private double rate;
    developer(String n, int i,int ot, double r){
        super(n,i);
        this.overtime=ot;
        this.rate=r;
    }
    public void setovertime(int overtime){
        this.overtime=overtime;
    }
    double getovertime(){
        return overtime;
    }
    public void setrate(double rate){
        this.rate=rate;
    }
    double getrate(){
        return rate;
    }
    @Override
    void calculateSalary()
    {
        double Salary=baseSalary+(overtime*rate);
        System.out.println("Developer Salary:"+Salary);
    }
}
public class EmployeeSystem{
    public static void main(String[] args)
    {
Scanner sc= new Scanner(System.in);
    System.out.println("Are you a manager or developer (1 for manager\n 0 for developer)");
    int choose = sc.nextInt();
    sc.nextLine();
    if (choose==1)
    {
    manager m = new manager(null, 0, 0);
    System.out.println("Enter your name");
    String name= sc.nextLine();
    m.setname(name);
    System.out.println("Enter your id");
    int id= sc.nextInt();
    m.setid(id);
    System.out.println("Enter your basesalary");
    double baseSalary= sc.nextDouble();
    System.out.println("Enter your bonus");
    double bonus= sc.nextDouble();
    m.setbonus(bonus);
    System.out.println("Name:"+m.getname());
    System.out.println("ID:"+m.getid());
    System.out.println("Salary:"+baseSalary);
    m.baseSalary=baseSalary;
    System.out.println("Bonus:"+m.getbonus());
    m.calculateSalary();
}
else if(choose==0)
{
    developer d=new developer(null,0,0,0);
    System.out.println("Enter your name");
    String name= sc.nextLine();
    d.setname(name);
    System.out.println("Enter your id");
    int id= sc.nextInt();
    d.setid(id);
    System.out.println("Enter your basesalary");
    double baseSalary= sc.nextDouble();
    d.baseSalary=baseSalary;
    System.out.println("Overtime hours?");
    int overtime= sc.nextInt();
    d.setovertime(overtime);    
    System.out.println("Overtime rate?");
    double rate= sc.nextDouble();
    d.setrate(rate);
    System.out.println("Name:"+d.getname());
    System.out.println("ID:"+d.getid());
    System.out.println("Salary:"+baseSalary);
    System.out.println("Overtime:"+d.getovertime());
    System.out.println("Overtime Rate:"+d.getrate());
    d.calculateSalary();

}
sc.close();
    }
}
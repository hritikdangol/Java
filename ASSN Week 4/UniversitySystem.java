class person{
    private String name;
    private int id;
    person(String n, int id){
        this.name=n;
        this.id=id;
    }
    public String getname(){
        return name;
    }
    public void setname(String name){
        this.name = name;
    }
    public int getid(){
        return id;
    }
    public void setid(int id){
        this.id = id;
    }
    void getroledetails(){
        System.out.println("DISPLAYINGG");
    }
}
class student extends person{
    String program;
    student(String n, int id, String p){
        super(n,id);
        this.program=p;
    }
    @Override
    void getroledetails() {
        {
            System.out.println("ROLE: STudent");
            System.out.println("NAme:" +getname());
            System.out.println("ID: " +getid());
            System.out.println("Program: " +program);
        }
    }
}
class teacher extends person{
    String subject;
    teacher(String n, int id, String s){
        super(n,id);
        this.subject=s;
    }
    @Override
    void getroledetails() {
        {
            System.out.println("ROLE: Teacher");
            System.out.println("NAme:" +getname());
            System.out.println("ID: " +getid());
             System.out.println("Subject: " +subject);

        }
    }
}
class admin extends person{
    String department;
    admin(String n, int id, String d){
        super(n,id);
        this.department=d;
    }
    @Override
    void getroledetails() {
        {
            System.out.println("ROLE: Teacher");
            System.out.println("NAme:" +getname());
            System.out.println("ID: " +getid());
             System.out.println("Department: " +department);

        }
    }
}
public class UniversitySystem{
    public static void main(String[] args){
        student s1=new student("Hrithik",67,"BCSIT");
        teacher t1= new teacher("Ranil",45,"JAVA");
        admin a1=new admin("Kushal",50,"IT");
        s1.getroledetails();
         t1.getroledetails();
          a1.getroledetails();
    }
}
class Student {
private String name;
private int rollNum;
private double[] marks;
Student(String n, int r, double[] m){
    this.name=n;
    this.rollNum=r;
    this.marks=m;
}
public void setrollNum(int rollNum){
    this.rollNum=rollNum;
}
int getrollNum(){
    return rollNum;
}
public void setmarks(double[] marks){
    this.marks=marks;
}

double[] getmarks(){
    return marks;
}

public void setname(String name){
    this.name=name;
}
String getname(){
    return name;
}
void calculateAverage(){
    double sum=0;
    for(int i=0;i<marks.length;i++)
    {
        sum += marks[i];
    }
    double average=sum/marks.length;
    System.out.println("Your average is:"+ average);
}
}
class GraduateStudent extends Student{
    String thesisTopic;
    GraduateStudent(String n, int r, double[] m, String th){
        super(n, r, m);
        this.thesisTopic = th;
    }
    void displayTitle(){
        System.out.println("Name :"+ getname());
        System.out.println("Rollnum"+ getrollNum());
        System.out.println("Thesis title:"+ thesisTopic);
    }
}
public class GradeBook{
    public static void main(String[] args)
    {
        GraduateStudent s1=new GraduateStudent("Hritik",67,new double[]{69,70,45},"Chicken Jump");
    s1.displayTitle();
    s1.calculateAverage();
     GraduateStudent s2=new GraduateStudent("Ranil",57,new double[]{58,26,44},"Habits");
    s2.displayTitle();
    s2.calculateAverage();
    }
}
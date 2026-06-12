class Patient{
    private String name;
    private int age;
    Patient(String n, int a){
        this.name=n;
        this.age=a;
    }
    public void setname(String name){
        this.name=name;
    }
    String getname(){
        return name;
    }
        public void setage(int age){
        this.age=age;
    }
    int getage(){
        return age;
    }
    void getTreatmentPlan(){
        System.out.println("You are called in >>>> day");
    }
}
class Inpatient extends Patient{
    private int roomNumber;
        public void setroomNumber(int roomNumber){
        this.roomNumber=roomNumber;
    }
    int getroomNumber(){
        return roomNumber;
    }
    Inpatient(String n, int a, int rn){
        super(n,a);
        this.roomNumber=rn;
    }
    @Override
    void getTreatmentPlan(){
        System.out.println("Patient name: " + getname() + " of age " + getage() + " \nroom:" + roomNumber + "\n Plan: requested to meet the doctor");
    }
}
class Outpatient extends Patient{
        private String appointmentDate;
        public void setappointmentDate(String appointmentDate){
        this.appointmentDate=appointmentDate;
    }
    String getappointmentDate(){
        return appointmentDate;
    }
    Outpatient(String n, int a, String ad){
        super(n,a);
        this.appointmentDate=ad;
    }
    @Override
    void getTreatmentPlan(){
        System.out.println("Patient :" + getname() + " of age " + getage() + " years. \nDate appointed at morning 8AM on " + appointmentDate);
    }
}
public class HospitalRecords{
    public static void main( String[] args){
        Inpatient i1= new Inpatient("Hrithik", 20,506);
        Outpatient o1= new Outpatient("Ranil",21,"2026/06/12");
        i1.getTreatmentPlan();
        o1.getTreatmentPlan();
    }
}
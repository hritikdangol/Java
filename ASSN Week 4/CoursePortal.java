class course{
    private String title;
    private double duration;
    private String instructor;
    course(String t, double d, String in){
        this.title=t;
        this.duration=d;
        this.instructor=in;
    }
    public void settitle(String title){
        this.title = title;
    }
    String gettitle(){
        return title;
    }
    public void setduration(double duration){
        this.duration = duration;
    }
    double getduration(){
        return duration;
    }
    public void setinstructor(String instructor){
        this.instructor = instructor;
    }
    String getinstructor(){
        return instructor;
    }
    void getCourseInfo(){
        System.out.println("Title:" + title + " Duration:" + duration + " Instructor:" + instructor);
    }
}
class livecourse extends course{
    String scheduletime;
    livecourse(String t,double d, String in, String st){
        super(t,d,in);
        this.scheduletime=st;
    }
    @Override
    void getCourseInfo(){
         System.out.println("LIVECOURSE");
        System.out.println("\nTitle:" + gettitle() + "\nDuration:" + getduration() + "\nInstructor:" + getinstructor() + "\n Schedule Time:" + scheduletime);
    }
}
class recordedCourse extends course{
    String videoCount;
    recordedCourse(String t, double d, String in, String vc){
        super(t, d, in);
        this.videoCount = vc;
    }
    @Override
    void getCourseInfo(){
        System.out.println("RECORDED COURSE");
        System.out.println("\nTitle:" + gettitle() + "\nDuration:" + getduration() + "\nInstructor:" + getinstructor() + "\nVideo Count:" + videoCount);
    }
}
public class CoursePortal{
    public static void main(String[] args){
        livecourse l1 = new livecourse("Java Programming", 12.0, "Alice", "Mon 10 AM");
        recordedCourse r1 = new recordedCourse("Digital SYstem", 8.0, "Bob", "2 hrs");
        l1.getCourseInfo();
        r1.getCourseInfo();
    }
}

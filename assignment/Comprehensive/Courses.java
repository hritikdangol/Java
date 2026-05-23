import java.util.Scanner;
class Student {
    String name;
    String stream;

    Student(String n, String s) {
        this.name = n;
        this.stream = s;
    }
    void showCourses() {
        System.out.println("Student Name: " + name);
        System.out.println("Stream: " + stream);
        switch (stream) {

            case "science":
                System.out.println("Eligible Courses:");
                System.out.println("Engineering");
                System.out.println("Computer Science");
                break;

            case "commerce":
                System.out.println("Eligible Courses:");
                System.out.println("BBS");
                System.out.println("CA");
                break;

            case "arts":
                System.out.println("Eligible Courses:");
                System.out.println("Journalism");
                System.out.println("Fine Arts");
                break;
            default:
                System.out.println("Invalid stream");
        }
    }
}

public class Courses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Stream (science/commerce/arts): ");
        String stream = sc.nextLine();
        Student s1 = new Student(name, stream);
        s1.showCourses();
        sc.close();
    }
}
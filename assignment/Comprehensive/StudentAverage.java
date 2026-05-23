import java.util.Scanner;

public class StudentAverage {
    String name;
    double[] marks = new double[3];
    double average;

    void inputMarks() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name of the student: ");
        name = sc.nextLine();

        System.out.println("Enter marks of 3 subjects:");
        for (int i = 0; i < 3; i++) {
            marks[i] = sc.nextDouble();
        }
        sc.close();
    }

    void averageCalc() {
        double sum =0;

        for (int i=0;i<3;i++) {
            sum += marks[i];
        }

        average = sum / 3;
    }

    void display() {
        System.out.println("Name of the student: " + name);

        System.out.println("Marks:");
        for (int i=0; i<3;i++) {
            System.out.println(marks[i]);
        }

        System.out.println("Average:" + average);

        if (average >= 40) {
            System.out.println(name +" is PASSED");
        } else {
            System.out.println(name +" is FAILED");
        }
    }
}

class Main {
    public static void main(String[] args) {
        StudentAverage s1 =new StudentAverage();
        s1.inputMarks();
        s1.averageCalc();
        s1.display();
    }
}
import java.util.Scanner;

class Grade {
    String name = "Hrithik";
    Scanner sc = new Scanner(System.in);

    void showDetails() {
        System.out.println("Name: " + name);
    }

    void calculateGrade() {
        System.out.print("Enter marks (0-100): ");
        int marks = sc.nextInt();

        if (marks < 0 || marks > 100) {
            System.out.println("Invalid marks");
        }
        else if (marks >= 90) {
            System.out.println("Grade: A");
        }
        else if (marks >= 80) {
            System.out.println("Grade: B");
        }
        else if (marks >= 70) {
            System.out.println("Grade: C");
        }
        else if (marks >= 60) {
            System.out.println("Grade: D");
        }
        else {
            System.out.println("Grade: F");
        }
    }
}

public class GradeCalculatorMain {
    public static void main(String[] args) {
        Grade gc = new Grade();
        gc.showDetails();
        gc.calculateGrade();
    }
}
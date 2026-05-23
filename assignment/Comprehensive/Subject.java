public class Subject {
    String subjectName;
    int marks;
    String grade;

    Subject(String sn, int m) {
        this.subjectName = sn;
        this.marks = m;
    }

    void assignGrade() {
        if (marks >= 90) {
            grade = "A";
        } else if (marks >= 80) {
            grade = "B";
        } else if (marks >= 70) {
            grade = "C";
        } else {
            grade = "D";
        }
    }
    void display() {
        System.out.println("Subject: " + subjectName);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade);
    }
}
 class GradeAssignment {
    public static void main(String[] args) {
        Subject[] s1 = new Subject[5];

        s1[0] = new Subject("Math", 95);
        s1[1] = new Subject("Science", 82);
        s1[2] = new Subject("English", 74);
        s1[3] = new Subject("Computer", 68);
        s1[4] = new Subject("Social", 88);
        for (int i = 0; i < 5; i++) {
            s1[i].assignGrade();
            s1[i].display();
        }
    }
}
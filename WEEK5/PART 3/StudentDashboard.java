 class StudentDashboard {
    void displayCourseStatus(String studentId, String courseId, EligibilityRule rule){
        System.out.println("Checking enrollment status for " + studentId + " in " + courseId + "...");
        try{
            if(rule.isEligible(studentId, courseId)){
                System.out.println(" You are enrolled! Access course materials now.");
            }
        }
        catch(EnrollmentDeniedException e){
            System.out.println(" Enrollment denied: " + e.getMessage() + ". Please contact support.");
        }
        finally{
            System.out.println("Status check completed for " + studentId + ".");
        }
    }
    public static void main(String[] args) {
        StudentDashboard d1= new StudentDashboard();
       EligibilityRule r1 = (studentId, courseId) -> {
            if (studentId.equals("SKILL")&& courseId.equals("JAVA101")){
                return true;
            }
            else if (studentId.equals("SKILL999")) {
                throw new EnrollmentDeniedException("Student account suspended due to outstanding fees, Roshan!");
            }
            else if(!studentId.startsWith("SKILL")&& courseId.equals("JAVA101")){
                throw new EnrollmentDeniedException("Invalid student ID format. Please use 'SKILL' prefix, Anisha!");
            }
            else
                System.out.println("Not eligible");
            return false;
        };
            d1.displayCourseStatus("SKILL", "JAVA101", r1);
            d1.displayCourseStatus("SKILL99", "JAVA101", r1);
            d1.displayCourseStatus("STUDENT1", "JAVA101", r1);
    }
}

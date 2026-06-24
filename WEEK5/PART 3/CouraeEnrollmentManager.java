class CourseEnrollmentManager{
    void enrollStudent(String studentId, String courseId, EligibilityRule rule){
        System.out.println("Attempting to enroll " + studentId + " in " + courseId + "...");
        try {
            if(rule.isEligible(studentId, courseId)){
                System.out.println("Enrollment successful for " + studentId + " in " + courseId + "! Happy learning!");
            }
        } catch (EnrollmentDeniedException e) {
            System.out.println("Enrollment failed for " + studentId + ": " + e.getMessage());
        }
    }
    public static void main(String[] args) {

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
        CourseEnrollmentManager s1= new CourseEnrollmentManager();
        s1.enrollStudent("SKILL", "JAVA101", r1);
        s1.enrollStudent("SKILL999", "JAVA101", r1);
        s1.enrollStudent("Null", "JAVA101", r1);
        
}
}
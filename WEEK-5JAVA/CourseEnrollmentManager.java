class CourseEnrollmentManager{
    void enrollStudent(String studentId, String courseId, EligibilityRule rule){
        System.out.println("Attempting to enroll " + studentId + " in " + courseId + "...");
        try {
            if(rule.isEligible(studentId, courseId)){
                System.out.println("Enrollment successful for " + studentId + " in " + courseId + " Learning");
            }
        } catch (EnrollmentDeniedException e) {
            System.out.println("Enrollment failed for " + studentId + ": " + e.getMessage());
        }
    }
    public static void main(String[] args) {

        EligibilityRule r1 = (studentId, courseId) -> {
            if (studentId.equals("XYZ")&& courseId.equals("I001")){
                return true;
            }
            else if (studentId.equals("SKILL")) {
                throw new EnrollmentDeniedException("Student account suspended due to  fees, Riya!");
            }
            else if(!studentId.startsWith("SKILL")&& courseId.equals("I001")){
                throw new EnrollmentDeniedException("Invalid student ID format. Please use 'SKILL' prefix, Jenish");
            }
            else
                System.out.println("Not eligible");
            return false;
        };
        CourseEnrollmentManager s1= new CourseEnrollmentManager();
        s1.enrollStudent("XYZ", "I001", r1);
        s1.enrollStudent("SKILL", "I001", r1);
        s1.enrollStudent("Null", "I001", r1);
        
}
}
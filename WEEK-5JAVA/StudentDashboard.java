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
            if (studentId.equals("XYZ")&& courseId.equals("C001")){
                return true;
            }
            else if (studentId.equals("PQR")) {
                throw new EnrollmentDeniedException("Student account suspended because of fees, Riya");
            }
            else if(!studentId.startsWith("XYZ")&& courseId.equals("C001")){
                throw new EnrollmentDeniedException("Invalid student ID format, Jenisha");
            }
            else
                System.out.println("Not eligible");
            return false;
        };
            d1.displayCourseStatus("XYZ", "C001", r1);
            d1.displayCourseStatus("PQR", "C001", r1);
            d1.displayCourseStatus("STUDENT1", "C001", r1);
    }
}
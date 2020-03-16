/**
    This will hold the middleschool student sub class, which extent the Student
    superclass. It will call the display report method from the Student class
    and implement the TestTaker interface.

    @author Tom Good
*/
class MiddleSchoolStudent extends StudentPart2 {

    private String extracurricularActivities;

    /**
        get the student's extracurricular activities

        @return extracurricularActivities
     */
     public String getExtracurricularActivites() {
         return extracurricularActivities;
     }

     /**
        set the student's extracurricular activities

        @param newExtracurricularActivities
     */
     public void setExtracurricularActivities(String newExtracurricularActivities) {
         this.extracurricularActivities = newExtracurricularActivities;
     }

      /**
        Call the abstract method from StudentPart2

        @return string containing report
     */
     public String displayReport() {
         return "Student ID: " + getStudentId() + "\nStudent Name: "
            + getStudentName() + "\nSchool: " + getStudentSchool()
            + "\nExtracurricular Activities: " + extracurricularActivities;
     }

     /**
        This method will display that the student is taking a test
     */
     public void takeTest() {
         System.out.println("Middle school student is taking the test...");
     }

     public String getTestResults() {
         return "This student took the middle school level test!";
     }
}
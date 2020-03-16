/**
    This will hold the highschool student sub class, which extent the Student
    superclass. It will call the display report method from the Student class
    and implement the TestTaker interface.

    @author Tom Good
*/
class HighSchoolStudent extends StudentPart2 {

    private String homeroomTeacher;

    /**
        get the student's homeroom teacher

        @return homeroomTeacher
     */
     public String getHomeroomTeacher() {
         return homeroomTeacher;
     }

     /**
        set the student's homeroom teacher

        @param newHomeroomTeacher
     */
     public void setHomeroomTeacher(String newHomeroomTeacher) {
         this.homeroomTeacher = newHomeroomTeacher;
     }

     /**
        Call the abstract method from StudentPart2

        @return string containing report
     */
      public String displayReport() {
         return "Student ID: " + getStudentId() + "\nStudent Name: "
            + getStudentName() + "\nSchool: " + getStudentSchool()
            + "\nHomeroom Teacher: " + homeroomTeacher;
     }

     /**
        This method will display that the student is taking a test

     */
     public void takeTest() {
         System.out.println("High school student is taking the test...");
     }

     public String getTestResults() {
         return "This student took the high school level test!";
     }

}
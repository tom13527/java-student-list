/**
    This class will hold the abstract class for student objects. It will create
    the report for each student to be displayed to the page.

    @author Tom Good
*/
abstract class StudentPart2 implements TestTaker {

     // create variables
    private int studentId;
    private String studentName;
    private String studentSchool;

    // get methods

     /**
        get the student's id

        @return studentId
     */
     public int getStudentId() {
         return studentId;
     }

     /**
        get the student's name

        @return studentName;
     */
     public String getStudentName() {
         return studentName;
     }

     /**
        get the student's school

        @return studentSchool
     */
     public String getStudentSchool() {
         return studentSchool;
     }

     // set methods

     /**
        set the students id

        @param newStudentId
     */
     public void setStudentId(int newStudentId) {
         studentId = newStudentId;
     }

     /**
        set the students name

        @param newStudentName
     */
     public void setStudentName(String newStudentName) {
         studentName = newStudentName;
     }

     /**
        set the student's school

        @param newStudentSchool
     */
     public void setStudentSchool(String newStudentSchool) {
         studentSchool = newStudentSchool;
     }

     /**
        Display the progress report of each student

        @return string containing student's progress report
     */
     public abstract String displayReport();
}
/**
    This class will hold information for the Student object.
    It will hold all it's variables, get and set methods, as well
    as a method to display the data of this class.

    @author Tom Good
*/
public class Student {

    // create variables
    private int studentId;
    private String studentName;
    private String studentSchool;
    private String extracurricularActivities;
    private String homeroomTeacher;

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

     /**
        get the student's extracurricular activities

        @return extracurricularActivities
     */
     public String getExtracurricularActivites() {
         return extracurricularActivities;
     }

     /**
        get the student's homeroom teacher

        @return homeroomTeacher
     */
     public String getHomeroomTeacher() {
         return homeroomTeacher;
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
        set the student's extracurricular activities

        @param newExtracurricularActivities
     */
     public void setExtracurricularActivities(String newExtracurricularActivities) {
         extracurricularActivities = newExtracurricularActivities;
     }

     /**
        set the student's homeroom teacher

        @param newHomeroomTeacher
     */
     public void setHomeroomTeacher(String newHomeroomTeacher) {
         homeroomTeacher = newHomeroomTeacher;
     }

     /**
        This method will return a string of the student
        information.

        @return a string of student information
     */
     public String toString() {
         return super.toString() + "Student ID number: " + studentId
            + "\nName: " + studentName + "\nSchool: " + studentSchool
            + "\nExtracurricular Activities: " + extracurricularActivities
            + "\nHomeroom Teacher: " + homeroomTeacher;
     }
}
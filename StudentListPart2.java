import java.util.*;
/**
    This class will prompt the user for information on a
    student they wish to enter. It will be held within and ArrayList.

    @author Tom Good
*/
public class StudentListPart2 {

    // create instance variables
    private ArrayList students;
    private InputHelper input;

    /**
        This method will run all methods necessary to create a
        student progress report
    */
    public void run() {
        createStudents();
        display();
    }

    /**
        This ArrayList will add students based on the user's
        input.
    */
    public void createStudents() {

        // instantiate variables
        input = new InputHelper();
        students = new ArrayList<>();


        // create variables to hold input
        String studentIdString = "";
        String studentName = "";
        String studentSchool = "";
        String homeroomTeacher = "";
        String studentGradeLevel = "";
        String extracurricularActivities = "";
        String showTellItem = "";
        String test = "";
        int studentIdNum = 0;
        int studentId = 0;
        String more = "";
        HighSchoolStudent newHighSchoolStudent = null;
        MiddleSchoolStudent newMiddleSchoolStudent = null;
       ElementaryStudent  newElementaryStudent = null;

        // use loop for input
        while (true) {
            studentIdString = input.getUserInput(
                "Please enter student ID number.");
            studentName = input.getUserInput(
                "Enter the student's name.");
            studentSchool = input.getUserInput(
                "Enter the student's school.");
            studentGradeLevel = input.getUserInput(
                "Enter the student grade level. High School = h, Middle School "
                + "= m, or Elementary = e.");
            studentIdNum = Integer.parseInt(studentIdString);
            if (studentGradeLevel.equals("h")) {
                homeroomTeacher = input.getUserInput(
                    "Enter the student's homeroom teacher.");
                newHighSchoolStudent = new HighSchoolStudent();
                System.out.println("");
                newHighSchoolStudent.takeTest();
                System.out.println("");
                newHighSchoolStudent.setStudentId(studentIdNum);
                newHighSchoolStudent.setStudentName(studentName);
                newHighSchoolStudent.setStudentSchool(studentSchool);
                newHighSchoolStudent.setHomeroomTeacher(homeroomTeacher);
                students.add(newHighSchoolStudent);
            }
             if (studentGradeLevel.equals("m")) {
                extracurricularActivities = input.getUserInput(
                    "Enter the student's extracurricular activities.");
                newMiddleSchoolStudent = new MiddleSchoolStudent();
                System.out.println("");
                newMiddleSchoolStudent.takeTest();
                System.out.println("");
                newMiddleSchoolStudent.setStudentId(studentIdNum);
                newMiddleSchoolStudent.setStudentName(studentName);
                newMiddleSchoolStudent.setStudentSchool(studentSchool);
                newMiddleSchoolStudent.setExtracurricularActivities(
                    extracurricularActivities);
                students.add(newMiddleSchoolStudent);
            }
            if (studentGradeLevel.equals("e")) {
                showTellItem = input.getUserInput(
                    "Enter the student's show and tell item.");
                newElementaryStudent = new ElementaryStudent();
                System.out.println("");
                newElementaryStudent.takeTest();
                System.out.println("");
                newElementaryStudent.setStudentId(studentIdNum);
                newElementaryStudent.setStudentName(studentName);
                newElementaryStudent.setStudentSchool(studentSchool);
                newElementaryStudent.setShowTellItem(showTellItem);
                students.add(newElementaryStudent);
            }
            more = input.getUserInput(
                    "Would you like to enter another student? Yes = y.");
            if (!more.equals("y")) {
                    break;
            }
        }
    }

    /**
        This method will display the students to the page
    */
    public void display() {

        StudentPart2 student = null;
        for (int counter = 0; counter < students.size(); counter++) {
            student = (StudentPart2) students.get(counter);
            System.out.println("");
            System.out.println(student.displayReport());
            System.out.println(student.getTestResults());
            System.out.println();
        }
    }
}

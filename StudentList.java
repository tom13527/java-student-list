import java.util.*;
/**
    This class will hold and array list to set the student
    information of different objects.

    @author Tom Good
*/
public class StudentList {

    // create new Arraylist
    ArrayList<Student> listOfStudents;

    /**
        This method will create students and store them in an
        array
    */
    public void createStudents() {

        // instantiate ArrayList
        listOfStudents = new ArrayList<Student>();

        // create students and set values
        Student student1 = new Student();
        student1.setStudentId(123);
        student1.setStudentName("Joe Smith");
        student1.setStudentSchool("Webster High School");
        student1.setExtracurricularActivities("Football");
        student1.setHomeroomTeacher("Mr. Johnson");
        listOfStudents.add(student1);

        KindergartenStudent student2 = new KindergartenStudent();
        student2.setStudentId(456);
        student2.setStudentName("Jessie Hams");
        student2.setStudentSchool("Webster Elementary");
        student2.setExtracurricularActivities("Art club");
        student2.setHomeroomTeacher("Mrs. Jam");
        student2.setShowTellItem("Her cat Sparkles");
        listOfStudents.add(student2);

        // output information
        System.out.println(student1);
        System.out.println("");
        System.out.println(student2);
    }
}
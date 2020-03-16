/**
    This class will be the test drive class for the StudentList
    class. It will call it's method.

    @author Tom Good
*/
public class StudentListTestDrive {

    /**
        This will be the main method for the StudentList class.
        It will call on the class's method to display.

        @param args command line arguements
    */
    public static void main(String[] array) {

        // instantiate StudentList
        StudentList list = new StudentList();

        // call method
        list.createStudents();
    }
}
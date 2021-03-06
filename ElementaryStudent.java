/**
    This will hold the elementary student sub class, which extent the Student
    superclass. It will call the display report method from the Student class
    and implement the TestTaker interface.

    @author Tom Good
*/
class ElementaryStudent extends StudentPart2 {

    private String showTellItem;

    /**
        get the show and tell item

        @return showTellItem
    */
    public String getShowTellItem() {
        return showTellItem;
    }

    /**
        set the show and tell item

        @param newShowTellItem
    */
    public void setShowTellItem(String newShowTellItem) {
        this.showTellItem = newShowTellItem;
    }

     /**
        Call the abstract method from StudentPart2

        @return string containing report
     */
     public String displayReport() {
         return "Student ID: " + getStudentId() + "\nStudent Name: "
            + getStudentName() + "\nSchool: " + getStudentSchool()
            + "\nShow and Tell Item: " + showTellItem;
     }

     /**
        This method will display that the student is taking a test

     */
     public void takeTest() {
         System.out.println("Elementary student is taking the test...");
     }

     public String getTestResults() {
         return "This student took the elementary level test!";
     }

}
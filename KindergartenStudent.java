/**
    This subclass will hold the kindergarten student object
    and will extend the Student class. It hold new information
    from the student superclass and display all information to the
    page.

    @author Tom Good
*/
class KindergartenStudent extends Student {

    // create new private instance variable
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
        This method will display information about this kindergarten
        student to the page

        @return student information
    */
    public String toString() {
        return super.toString() + "\nShow and Tell Item: " + showTellItem;
    }

}
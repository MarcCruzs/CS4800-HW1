package AGGREGATION;

public class Instructor {
    private String firstName;
    private String lastName;
    private String officeNumber;

    /**
     * This constructs the Instructor Class with its members/attributes
     * @param firstName             The first name of the instructor
     * @param lastName              The last name of the instructor
     * @param officeNumber          The office number of the instructor
     */
    public Instructor(String firstName, String lastName, String officeNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.officeNumber = officeNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getOfficeNumber() {
        return officeNumber;
    }

    public void setOfficeNumber(String officeNumber) {
        this.officeNumber = officeNumber;
    }
}

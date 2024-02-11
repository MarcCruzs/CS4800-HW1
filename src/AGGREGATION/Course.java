package AGGREGATION;

public class Course {
    private String courseName;
    private Instructor instructor;
    private Textbook textbook;

    /**
     * Constructs member of Course and aggregation of instructor and textbook classes.
     * @param courseName            The name of the course
     * @param instructor            The instructor's information
     * @param textbook              The textbook's information
     */
    public Course(String courseName, Instructor instructor, Textbook textbook) {
        this.courseName = courseName;
        this.instructor = instructor;
        this.textbook = textbook;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public Textbook getTextbook() {
        return textbook;
    }

    public void setTextbook(Textbook textbook) {
        this.textbook = textbook;
    }

    public void printInfo(){
        System.out.println("Course name: " + this.courseName);
        System.out.println("Information:");
        System.out.println("Instructor: " + instructor.getFirstName() + " " + instructor.getLastName());
        System.out.println("Instructor's Office: " + instructor.getOfficeNumber());
        System.out.println("Textbook: " + textbook.getTitle() + " by " + textbook.getAuthor());
        System.out.println("Textbook: " + textbook.getPublisher());
    }
}

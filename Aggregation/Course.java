public class Course {

    private String name;

    private Instructor instructor;

    private Textbook textbook;

    private Instructor instructor2;
    private Textbook textbook2;


    public Course(String name, Instructor instructor, Textbook textbook, Instructor instructor2, Textbook textbook2) {
        this.name = name;
        this.instructor = instructor;
        this.textbook = textbook;
        this.instructor2 = instructor2;
        this.textbook2 = textbook2;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public Instructor getInstructor2() {
        return instructor2;
    }

    public Textbook getTextbook() {
        return textbook;
    }

    public Textbook getTextbook2() {
        return textbook2;
    }

    public String getName() {
        return name;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public void setInstructor2(Instructor instructor2) {
        this.instructor2 = instructor2;
    }

    public void setTextbook(Textbook textbook) {
        this.textbook = textbook;
    }

    public void setTextbook2(Textbook textbook2) {
        this.textbook2 = textbook2;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println("Name: " + this.name + "\nInstructor: " +
                instructor.getFirstName() + " " + instructor.getLastName() +
                ", Instructor office number: " + instructor.getOfficeNumber() +
                ", Textbook: " + textbook.getTitle() + " by " + textbook.getAuthor() + ", published by: " + textbook.getPublisher());
        System.out.println("Instructor: " +
                instructor2.getFirstName() + " " + instructor2.getLastName() +
                ", Instructor office number: " + instructor2.getOfficeNumber() +
                ", Textbook: " + textbook2.getTitle() + " by " + textbook2.getAuthor() + ", published by: " + textbook2.getPublisher());


    }
}

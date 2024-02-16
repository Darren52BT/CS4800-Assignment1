package Inheritance;


public class Employee {
    private String firstName;
    private String lastName;
    private String ssn;

    //accepts strings representing first name, last name, and SSN
    public Employee(String firstName, String lastName, String ssn) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
    }

    //GETTER: first name string
    public String getFirstName() {
        return this.firstName;
    }

    //SETTER: first name string
    public void setFirstName(String fname) {
        this.firstName = fname;
    }

    //GETTER: last name string
    public String getLastName() {
        return this.lastName;
    }

    //SETTER: last name string
    public void setLastName(String lname) {
        this.lastName = lname;
    }

    //GETTER: SSN string
    public String getSsn() {
        return this.ssn;
    }

    //SETTER: SSN string
    public void setSsn(String ssn) {
        this.ssn = ssn;
    }


    //print function
    public void print(){
    System.out.print(this.firstName + ", " + this.lastName + ", " + this.ssn);
    }

}


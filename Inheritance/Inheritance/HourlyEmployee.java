package Inheritance;

public class HourlyEmployee extends Employee {

    private Integer wage;
    private Integer numHoursWorked;

    public HourlyEmployee(String firstName, String lastName, String ssn, Integer wage, Integer numHours) {
        super(firstName, lastName, ssn);
        this.wage = wage;
        this.numHoursWorked = numHours;
    }


    //GETTER: Integer wage
    public Integer getWage() {
        return this.wage;
    }

    //SETTER: Integer wage
    public void setWage(Integer wage) {
        this.wage = wage;
    }

    //GETTER: Integer number of hours worked
    public Integer getNumHoursWorked() {
        return this.numHoursWorked;
    }

    //SETTER: Integer number of hours worked
    public Integer setNumHoursWorked() {
        return this.numHoursWorked;
    }

    //print function
    public void print(){
        super.print();
        System.out.println(", $" + this.wage + ", " + this.numHoursWorked + "hrs");
    }
}

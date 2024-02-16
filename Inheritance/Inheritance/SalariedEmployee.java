package Inheritance;

public class SalariedEmployee extends Employee {

    private Integer weeklySalary;

    public SalariedEmployee(String firstName, String lastName, String ssn, Integer weeklySalary) {
        super(firstName, lastName, ssn);
        this.weeklySalary = weeklySalary;
    }


    //GETTER: Integer weekly salary
    public Integer getWeeklySalary() {
        return weeklySalary;
    }

    //SETTER: Integer weekly salary
    public void setWeeklySalary(Integer weeklySalary) {
        this.weeklySalary = weeklySalary;
    }

    //print function
    public void print(){
    super.print();
    System.out.println(", $" + this.weeklySalary);
    }

}

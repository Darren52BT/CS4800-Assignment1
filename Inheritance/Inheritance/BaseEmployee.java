package Inheritance;

public class BaseEmployee extends Employee {
    private Integer baseSalary;

    public BaseEmployee(String firstName, String lastName, String ssn, Integer baseSalary) {
        super(firstName, lastName, ssn);
        this.baseSalary = baseSalary;
    }


    //GETTER: Integer base salary
    public Integer getBaseSalary() {
        return baseSalary;
    }

    //SETTER: Integer base salary
    public void setBaseSalary(Integer baseSalary) {
        this.baseSalary = baseSalary;
    }

    //print function
    public void print(){
    super.print();
    System.out.println(", $" + baseSalary);
    }
}

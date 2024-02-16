package Inheritance;

public class CommissionEmployee extends Employee {

    private Integer commRate;
    private Integer grossSales;

    public CommissionEmployee(String firstName, String lastName, String ssn, Integer commRate, Integer grossSales) {
        super(firstName, lastName, ssn);
        this.commRate = commRate;
        this.grossSales = grossSales;
    }


    //GETTER: integer commission rates
    public Integer getCommRate() {
        return this.commRate;
    }

    //SETTER: integer commission rates
    public void setCommRate(Integer commRate) {
        this.commRate = commRate;
    }

    //GETTER: integer gross sales
    public Integer getGrossSales() {
        return this.grossSales;
    }

    //SETTER: integer gross sales
    public void setGrossSales(Integer grossSales) {
        this.grossSales = grossSales;
    }

    //print function
    public void print(){
    super.print();
    System.out.println(", " + this.commRate + "%, $" + this.grossSales);
    }
}

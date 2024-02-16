public class CruiseShip  extends Ship{

    private int maxNumOfPass;
    public CruiseShip(String name, String year, int maxNumOfPass) {
        super(name, year);
        this.maxNumOfPass = maxNumOfPass;
    }

    public int getMaxNumOfPass(){
        return this.maxNumOfPass;
    }

    public void setMaxNumOfPass(int maxNumOfPass){
        this.maxNumOfPass = maxNumOfPass;
    }

    @Override public void print(){
        System.out.println("Name: " + this.getName() + ", Max Num of Pass.: " + this.maxNumOfPass);
    }
}

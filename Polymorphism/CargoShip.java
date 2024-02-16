public class CargoShip extends Ship {
    private int cargoCap;

    public CargoShip(String name, String year, int cargoCap) {
        super(name, year);
        this.cargoCap = cargoCap;
    }

    public int getCargoCap() {
        return cargoCap;
    }

    public void setCargoCap(int cargoCap) {
        this.cargoCap = cargoCap;
    }

    @Override
    public void print() {
        System.out.println("Name: " + this.getName() + ", Ship Cargo Cap.: " + this.cargoCap + " tons");
    }
}

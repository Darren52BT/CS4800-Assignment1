public class Main {
    public static void main(String[] args) {

        Ship[] ships = {
                new Ship("Marco", "1900"),
                new CruiseShip("Charles", "1980", 2000),
                new CargoShip("May", "2000", 3000)
        };

        for (Ship ship : ships) {
            ship.print();
        }
    }
}
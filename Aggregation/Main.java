public class Main {
    public static void main(String[] args) {
        Instructor nima = new Instructor("Nima", "Davarpanah", "3-2636");
        Textbook cleanCode = new Textbook("Clean Code", "Robert Cecil Martin", "Pearson");

        Instructor randomGuy = new Instructor("John", "Doe", "1-2345");
        Textbook randomBook = new Textbook("Random Book", "Random Guy", "Random Publisher");
        Course softwareEng = new Course("CS4800", nima, cleanCode, randomGuy, randomBook);

        softwareEng.print();
    }
}
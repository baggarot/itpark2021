package lesson11;

public class CheckpointRunner {

    public static void main(String[] args) throws OverSpeedException, TravelBanException {
        Checkpoint toyota = new Checkpoint("car", "tundra", 75,
                3.26, 6.29, 2.03, 1.94);
        toyota.move();
        toyota.checkForDimensionsAndWeight();
        System.out.println("------------------------------");
        Checkpoint bugatti = new Checkpoint("car", "veyron", 250,
                2.2, 4.46, 1.99, 1.2);
        bugatti.move();
        System.out.println("------------------------------");
        Checkpoint lamborghini = new Checkpoint("car", "huracan", 95,
                1.42, 4.46, 1.92, 1.17);
        lamborghini.move();
        System.out.println("------------------------------");
        Checkpoint kamaz = new Checkpoint("truck", "65115", 70,
                10.13, 6.69, 2.5, 2.99);
        kamaz.move();
        kamaz.checkForDimensionsAndWeight();
        System.out.println("------------------------------");
        Checkpoint randomTransport = new Checkpoint("unknown", "unknown",
                (int) (Math.random() * 120),(Math.random() * 10), (Math.random() * 10), (Math.random() * 3),
                (Math.random() * 3));
        randomTransport.move();
        randomTransport.checkForDimensionsAndWeight();
    }
}

package lesson9;

public class Car extends Automobile {

    public Car(String typeOfTransport) {
        super(typeOfTransport);
    }

    public int maxDistance(int carDistance) {
        carDistance = getDistance(500);
        return carDistance;
    }
}
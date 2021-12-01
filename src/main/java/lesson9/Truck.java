package lesson9;

public class Truck extends Automobile {

    public Truck(String typeOfTransport) {
        super(typeOfTransport);
    }

    public int maxDistance(int truckDistance) {
        truckDistance = getDistance(1200);
        return truckDistance;
    }
}
package lesson9;

public abstract class Automobile {

    private String typeOfTransport;
    private int distance;

    public Automobile(String typeOfTransport) {
        this.typeOfTransport = typeOfTransport;
    }

    public int getDistance(int distance) {
        return this.distance;
    }

    public void move(int distance) {
        System.out.printf("Автомобиль %s прошел дистанцию %s км \n",
                typeOfTransport, distance);
    }
}
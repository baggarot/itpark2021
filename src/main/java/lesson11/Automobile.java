package lesson11;

public class Automobile {

    private final String typeOfTransport;
    private final String vehicleNumber;
    private final int travelSpeed;
    private final double weight;
    private final double length;
    private final double width;
    private final double height;

    public Automobile(String typeOfTransport, String vehicleNumber, int travelSpeed, double weight,
                      double length, double width, double height) {
        this.typeOfTransport = typeOfTransport;
        this.vehicleNumber = vehicleNumber;
        this.travelSpeed = travelSpeed;
        this.weight = weight;
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public String getTypeOfTransport() {
        return typeOfTransport;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public int getTravelSpeed() {
        return travelSpeed;
    }

    public double getWeight() {
        return weight;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void move() throws OverSpeedException {
        try {
            if (getTravelSpeed() > 80 & getTravelSpeed() <= 100) throw new OverSpeedException("Превышение допустимого " +
                    "значения скорости", getTravelSpeed());
        } catch (OverSpeedException ex) {
            System.out.println("Автомобиль превышает допустимое значение скорости равное 80 км/ч");
        }
        try {
            if (getTravelSpeed() > 100) throw new OverSpeedException("Превышение допустимого значения скорости",
                    getTravelSpeed());
        } catch (OverSpeedException ex) {
            System.out.println("В связи с превышением скорости движения более 100 км/ч задействована служба полиции, " +
                    "силами которой транспортное средство с номером " + getVehicleNumber() + " задержан");
        }
    }
}
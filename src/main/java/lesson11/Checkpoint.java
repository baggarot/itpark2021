package lesson11;

public class Checkpoint extends Automobile {

    public Checkpoint(String typeOfTransport, String vehicleNumber, int travelSpeed,
                      double weight, double length, double width, double height) {
        super(typeOfTransport, vehicleNumber, travelSpeed, weight, length, width, height);
    }

    public void checkForDimensionsAndWeight() throws TravelBanException {
        try {
            if (getWeight() > 8) throw new TravelBanException("Превышение по весу транспортного средства");
        } catch (TravelBanException ex) {
            System.out.println("Транспортное средство типа " + getTypeOfTransport() + " с номером "
                    + getVehicleNumber() + " не может проехать через КПП");
        }
        try{
            if (getHeight() > 4 && getWidth() > 2.5) throw new TravelBanException("Превышение по габаритам" +
                    "транспортного средства");
        } catch (TravelBanException ex) {
            System.out.println("Транспортное средство типа " + getTypeOfTransport() + " с номером "
                    + getVehicleNumber() + " не может проехать через КПП");
        }
    }
}
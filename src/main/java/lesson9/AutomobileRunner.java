package lesson9;

import java.util.Arrays;

public class AutomobileRunner {

    public static void main(String[] args) {
        Automobile car = new Car("car");
        Automobile truck = new Truck("truck");
        String[] auto = new String[10];
        for (int i = 0; i < auto.length; i++) {
            auto[i] = String.valueOf((int) (Math.random() * 2));
            if (auto[i].equals("0")) {
                auto[i] = "car";
                car.move((int) (Math.random() * 500));
            }
            if (auto[i].equals("1")) {
                auto[i] = "truck";
                truck.move((int) (Math.random() * 1000));
            }
        }
        System.out.println(Arrays.toString(auto));
    }
}

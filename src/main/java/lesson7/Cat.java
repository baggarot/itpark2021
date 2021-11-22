package lesson7;

public class Cat {

    String name;
    String breed;
    int age;
    double weight;
    double run;
    double swimming;

    public Cat(String name, String breed, int age, double weight, double run, double swimming) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.weight = weight;
        this.run = run;
        this.swimming = swimming;
    }

    public Cat(String name, String breed, double run, double swimming) {
        this.name = name;
        this.breed = breed;
        this.run = run;
        this.swimming = swimming;
    }

    public double getRun() {
        return run;
    }

    public void setRun(double run) {
        this.run = run;
    }

    public double getSwimming() {
        return swimming;
    }

    public void setSwimming(double swimming) {
        this.swimming = swimming;
    }
}

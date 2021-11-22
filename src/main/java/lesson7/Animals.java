package lesson7;

public class Animals {

    public static void main(String[] args) {
        Cat maineCoon = new Cat("Арнольд", "мейнкун", 7, 15.5, 150, 0);
        Cat outbred = new Cat("Васька", "Unknown", 180, 0);
        Dog husky = new Dog("Джек", "Хаски", 5, 37.3, 350, 15);
        Dog cur = new Dog("Балто", "Unknown", 300, 20);
        Tiger tiger = new Tiger("Шерхан", "Амурский тигр", 270, 700, 0);

        System.out.println("Кот Арнольд пробежал " + maineCoon.run + " м");
        System.out.println("Кот Васька пробежал " + outbred.run + " м");
        System.out.println("Пес Джек пробежал " + husky.run + " м");
        System.out.println("Пес Балто пробежал " + cur.run + " м");
        System.out.println(tiger.subspecies + " " + tiger.name + " весом " + tiger.weight + " кг пробежал "
                + tiger.run + " м");
        System.out.println("------------------------------------");
        maineCoon.setRun(200);
        System.out.println("Кот Арнольд пробежал " + maineCoon.getRun() + " м");
        outbred.setSwimming(5);
        System.out.println("Кот Васька проплыл " + outbred.getSwimming() + " м");
        husky.setRun(500);
        System.out.println("Пес Джек пробежал " + husky.getRun() + " м");
        cur.setSwimming(35);
        System.out.println("Пес Балто проплыл " + cur.getSwimming() + " м");
    }
}

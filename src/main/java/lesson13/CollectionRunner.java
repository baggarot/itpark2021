package lesson13;

import java.util.*;

public class CollectionRunner {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Иванов Иван Иванович", 10));
        employees.add(new Employee(2, "Петров Петр Петрович", 12));
        employees.add(new Employee(3, "Сидоров Сидр Сидорович", 7));
        employees.add(new Employee(4, "Иванова Марья Васильевна", 15));
        employees.add(new Employee(5, "Романова Елизавета Петровна", 21));
        employees.add(new Employee(6, "Еримов Макисм Александрович", 3));
        employees.add(new Employee(7, "Свиточ Ирина Анатольевна", 8));
        employees.add(new Employee(8, "Вахненко Игорь Владимирович", 18));
        employees.add(new Employee(9, "Синкевич Вера Григорьевна", 36));
        employees.add(new Employee(10, "Хмельницкая Любовь Альбертовна", 15));
        System.out.println("Введите искомое значение стажа работы");
        int workAge = in.nextInt();
        for (Employee employee : employees) {
            if (employee.getWorkAge() == workAge) {
                System.out.println(employee);
            }
        }
        System.out.println("-------------------------------");
        for (int i = employees.size() - 1; i >= 0; i--) {
            if (i % 2 != 0) {
                employees.remove(i);
            } else System.out.println(employees.get(i));
        }
    }
}

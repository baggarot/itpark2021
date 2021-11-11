package lesson3;

import java.util.Scanner;

public class HomeWork1 {

    public static void main(String[] args) {
        System.out.println("Вычисление корней квадратного уравнения ax^2+bx+c=0");
        System.out.println("Введите значение коэффициентов a, b и c");
        Scanner in = new Scanner(System.in);
        System.out.print("a = ");
        int a = in.nextInt();
        System.out.print("b = ");
        int b = in.nextInt();
        System.out.print("c = ");
        int c = in.nextInt();
        double discriminant = Math.pow(b, 2) - 4 * a * c;

        if (a == 0) {
            System.out.println("Первый коэффициент не может быть равен 0");
        } else {
            if (discriminant < 0) {
                System.out.println("Нет действительных решений уравнения");
            } else {
                if (discriminant == 0) {
                    double x = -b / (2 * a);
                    System.out.println("Корень квадратного уравнения x = " + x);
                } else {
                    double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                    double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
                    System.out.println("Корень квадратного уравнения x1 = " + x1);
                    System.out.println("Корень квадратного уравнения x2 = " + x2);
                }
            }
        }
    }
}

package lesson3;

import java.util.Scanner;

public class HomeWork2 {

    public static void main(String[] args) {
        System.out.println("Вычисление факториала числа n");
        Scanner in = new Scanner(System.in);
        System.out.println("Введите значение n");
        System.out.print("n =");
        int n = in.nextInt();
        System.out.println(factorial(n));
    }

    public static int factorial(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}

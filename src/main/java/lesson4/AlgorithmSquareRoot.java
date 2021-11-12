package lesson4;

import java.util.Scanner;

public class AlgorithmSquareRoot {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите значение числа n =");
        double n = in.nextDouble();
        System.out.println("Квадратный корень n = " + squareRoot(n));
    }

    public static double squareRoot(double n){
        double num;
        double half = n / 2;
        do {
            num = half;
            half = (num + (n / num)) / 2;
        } while ((num - half) != 0);
        return half;
    }
}

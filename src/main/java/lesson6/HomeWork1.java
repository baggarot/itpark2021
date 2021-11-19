package lesson6;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWork1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите значение n для определения длины массива");
        int n = in.nextInt();
        int[] arrayNumber = new int[n];
        for (int i = 0; i < arrayNumber.length; i++) {
            arrayNumber[i] = (int) (Math.random() * 1000);
        }
        System.out.println(Arrays.toString(arrayNumber));

        int max = arrayNumber[0];
        for (int i = 0; i < arrayNumber.length; i++) {
            max = Math.max(max, arrayNumber[i]);
        }
        System.out.println("Максимальное значение в массиве равно " + max);

        int min = arrayNumber[0];
        for (int i = 0; i < arrayNumber.length; i++) {
            min = Math.min(min, arrayNumber[i]);
        }
        System.out.println("Минимальное значение в массиве равно " + min);

        double mean = 0;
        int sum = 0;
        for (int i = 0; i < arrayNumber.length; i++) {
            sum += arrayNumber[i];
        }
        mean = sum / arrayNumber.length;
        System.out.println("Среднее арифмитическое значение элементов в массиве равно " + mean);
    }
}

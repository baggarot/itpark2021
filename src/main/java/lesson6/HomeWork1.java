package lesson6;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWork1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите значение n для определения длины массива");
        int n = in.nextInt();
        System.out.println(Arrays.toString(arrayNumber(n)));
        System.out.println("Максимальное значение в массиве равно " + maximumValue(n));
        System.out.println("Минимальное значение в массиве равно " + minimumValue(n));
        System.out.println("Среднее арифмитическое значение элементов в массиве равно " + mean(n));
    }

    public static int[] arrayNumber(int n){
        int[] arrayNumber = new int[n];
        for (int i = 0; i < arrayNumber.length; i++) {
            arrayNumber[i] = (int) (Math.random() * 1000);
        }
        return arrayNumber;
    }

    public static int maximumValue(int n){
        int[] arrayMaxNumber = Arrays.copyOf(arrayNumber(n), arrayNumber(n).length);
        int max = arrayMaxNumber[0];
        for (int j : arrayMaxNumber) {
            max = Math.max(max, j);
        }
        return max;
    }

    public static int minimumValue(int n){
        int[] arrayMinNumber = Arrays.copyOf(arrayNumber(n), arrayNumber(n).length);
        int min = arrayMinNumber[0];
        for (int j : arrayMinNumber) {
            min = Math.min(min, j);
        }
        return min;
    }

    public static double mean(int n){
        int[] arrayMean = Arrays.copyOf(arrayNumber(n), arrayNumber(n).length);
        double mean;
        double sum = 0;
        for (int j : arrayMean) {
            sum += j;
        }
        mean = sum / arrayMean.length;
        return mean;
    }
}

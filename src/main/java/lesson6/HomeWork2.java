package lesson6;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWork2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите значение n для определения границы последовательности Фибоначчи");
        int n = in.nextInt();
        System.out.println("Введите значение л для выведения числа из последовательности Фибоначчи");
        int k = in.nextInt();
        if (k < n) {
            int[] arrayNumber = Arrays.copyOfRange(fibonacciSequence(n), fibonacciSequence(n).length - n + k - 1,
                    fibonacciSequence(n).length - n + k);
            System.out.println(Arrays.toString(arrayNumber));
        } else {
            n = k;
            int[] arrayNumber = Arrays.copyOfRange(fibonacciSequence(n), fibonacciSequence(n).length - n + k - 1,
                    fibonacciSequence(n).length - n + k);
            System.out.println(Arrays.toString(arrayNumber));
        }
    }

    public static int[] fibonacciSequence(int n) {
        int[] arrayFibSeq = new int[n];
        arrayFibSeq[0] = 0;
        arrayFibSeq[1] = 1;
        for (int i = 2; i < arrayFibSeq.length; i++) arrayFibSeq[i] = arrayFibSeq[i - 1] + arrayFibSeq[i - 2];
        return arrayFibSeq;
    }
}
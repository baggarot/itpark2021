package lesson5;

import java.util.Scanner;

public class HomeWork {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите значение числа n для получения значения последовательности Фибоначчи");
        int n = in.nextInt();
        System.out.println("Член n последовательности Фибоначчи равен " + fibonacciSequence(n));
    }

    public static int fibonacciSequence(int n) {
        int num = 0;
        int fnum = 1;
        int fibSeq = 0;
        if (n == 0) {
            return num;
        } else if (n == 1) {
            return fnum;
        } else {
            for (int fseq = 2; fseq <= n; fseq++) {
                fibSeq = num + fnum;
                num = fnum;
                fnum = fibSeq;
            }
            return fibSeq;
        }
    }
}
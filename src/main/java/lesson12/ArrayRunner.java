package lesson12;

import java.util.Scanner;

public class ArrayRunner {

    public static void main(String[] args) throws MyArrayDataException {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите значение длины двумерного массива");
        int n = in.nextInt();
        Array array = new Array(n);
        try {
            array.arraySize();
        } catch (MyArraySizeException ex) {
            ex.printStackTrace();
            array = new Array(4);
        }
        array.randomValues();
        array.displayArray();
        try {
            array.arrayTransformation();
        } catch (MyArrayDataException ex) {
            ex.printStackTrace();
        }
        System.out.println("-----------------");
        int m = in.nextInt();
        Array array1 = new Array(m);
        try {
            array1.arraySize();
        } catch (MyArraySizeException ex) {
            ex.printStackTrace();
            array1 = new Array(4);
        }
        array1.fillingInLines();
        array1.displayArray();
        try {
            array1.arrayTransformation();
        } catch (MyArrayDataException ex) {
            ex.printStackTrace();
        }
    }
}
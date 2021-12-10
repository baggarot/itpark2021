package lesson12;

import java.util.Random;

public class Array {

    private int n;
    private String[][] array;

    public Array(int n) {
        this.n = n;
        this.array = new String[n][n];
    }

    public void arraySize() throws MyArraySizeException {
        if (this.n != 4)
            throw new MyArraySizeException("Недопустимый размер массива");
    }

    public void randomValues() {
        Random rand = new Random();
        for (int i = 0; i < this.n; i++) {
            for (int j = 0; j < this.n; j++) {
                array[i][j] = String.valueOf((char) (rand.nextInt(30) + 30));
            }
        }
    }

    public void fillingInLines() {
        for (int i = 0; i < this.n; i++) {
            for (int j = 0; j < this.n; j++) {
                array[i][j] = String.valueOf((int) (Math.random() * 1000));
            }
        }
    }

    public void displayArray() {
        for (int i = 0; i < this.n; i++) {
            for (int j = 0; j < this.n; j++) {
                System.out.print(this.array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public int arrayTransformation() throws MyArrayDataException {
        int[][] arraySum = new int[this.n][this.n];
        int sum = 0;
        for (int i = 0; i < this.n; i++) {
            for (int j = 0; j < this.n; j++) {
                try {
                    arraySum[i][j] = Integer.parseInt(array[i][j]);
                } catch (NumberFormatException ex) {
                    if (!arraySum.getClass().getComponentType().isPrimitive())
                        throw new MyArrayDataException("В ячейке " + arraySum[i][j] + " неверно укзаны данные");
                }
                sum = sum + arraySum[i][j];
            }
        }
        System.out.println("Сумма элементов в массиве равна " + sum);
        return sum;
    }
}
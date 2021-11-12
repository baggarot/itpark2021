package lesson4;

public class HomeWork {

    public static void main(String[] args) {
        System.out.println("Квадратный корень числа n = " + squareRoot(625));
        System.out.println("Квадратный корень числа n = " + squareRoot(144));
    }

    public static int squareRoot(int n) {
        int i = 1;
        while (i * i != n) {
            i++;
        }
        return i;
    }
}

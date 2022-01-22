package lesson2;

public class Calculator {

    public static void main(String[] args){
        System.out.println(addition(7,9));
        System.out.println(subtraction(3,17));
        System.out.println(multiplication(0,8));
        System.out.println(division(19,4));
    }

    public static int addition(int x, int y){
        return x + y;
    }

    public static int subtraction(int x, int y){
        return x - y;
    }

    public static int multiplication(int x, int y){
        return x * y;
    }

    public static double division(double x, double y){
        return x / y;
    }
}

package lesson8;

public class MatrixRunner extends OperationsOnMatrices {

    public static void main(String[] args) {
        Matrix first = new Matrix(2, 4);
        Matrix second = new Matrix(4, 2);
        Matrix defaultMatrix = new Matrix();
        int[][] matrix1 = {{17, 25, 31},
                           {21, 43, 11},
                           {56, 72, 24}};
        first.randomValues();
        second.randomValues();
        System.out.println("Матрица 1");
        first.displayMatrix();
        System.out.println("------------------");
        System.out.println("Матрица 2");
        second.displayMatrix();
        System.out.println("------------------");
        Matrix summa = addition(first, second);
        System.out.println("Сумма матриц 1 и 2");
        summa.displayMatrix();
        System.out.println("------------------");
        Matrix minus = subtraction(first, second);
        System.out.println("Разность матриц 1 и 2");
        minus.displayMatrix();
        System.out.println("------------------");
        System.out.println("Инверсия матриц 1 и 2");
        Matrix invFirst = inversion(first);
        Matrix invSecond = inversion(second);
        invFirst.displayMatrix();
        System.out.println("------------------");
        invSecond.displayMatrix();
        System.out.println("------------------");
        System.out.println("Единичная матрица");
        Matrix single = identityMatrix(defaultMatrix);
        single.displayMatrix();
        System.out.println("------------------");
        System.out.println("Умножение матрицы 1 на число k");
        Matrix numberArray = multiplicationNumber(first, 2);
        numberArray.displayMatrix();
        System.out.println("------------------");
        System.out.println("Умножение матрицы 1 на 2");
        Matrix multiply = multiplication(first, second);
        multiply.displayMatrix();
        System.out.println("------------------");
        System.out.println("Возведение матрицы 1 в квадрат");
        Matrix square = matrixSquaring(first);
        square.displayMatrix();
        System.out.println("------------------");
        int detMatrix = determinant(matrix1);
        System.out.println("Определитель матрицы " + detMatrix);
        System.out.println("------------------");
    }
}

package lesson8;

public class OperationsOnMatrices extends Matrix {

    public static Matrix addition(Matrix first, Matrix second) {
        Matrix sumMatrix = new Matrix(first.getVerticalLength(), second.getHorizontalLength());
        for (int i = 0; i < sumMatrix.getHorizontalLength(); i++) {
            for (int j = 0; j < sumMatrix.getVerticalLength(); j++) {
                sumMatrix.setElement(i, j, first.getElement(i, j) + second.getElement(i, j));
            }
        }
        return sumMatrix;
    }

    public static Matrix subtraction(Matrix first, Matrix second) {
        Matrix subMatrix = new Matrix(first.getVerticalLength(), second.getHorizontalLength());
        for (int i = 0; i < subMatrix.getHorizontalLength(); i++) {
            for (int j = 0; j < subMatrix.getVerticalLength(); j++) {
                subMatrix.setElement(i, j, first.getElement(i, j) - second.getElement(i, j));
            }
        }
        return subMatrix;
    }

    public static int[][] inversion(int[][] invMatrix) {
        int[][] inverseMatrix = new int[invMatrix[0].length][invMatrix.length];
        for (int i = 0; i < invMatrix[0].length; i++) {
            for (int j = 0; j < invMatrix.length; j++) {
                inverseMatrix[i][j] = invMatrix[j][i];
            }
        }
        return inverseMatrix;
    }

    public static Matrix inversion(Matrix invMatrix) {
        Matrix inverseMatrix = new Matrix(invMatrix.m, invMatrix.n);
        for (int i = 0; i < invMatrix.m; i++) {
            for (int j = 0; j < invMatrix.n; j++) {
                inverseMatrix.setElement(i, j, invMatrix.getElement(j, i));
            }
        }
        return inverseMatrix;
    }

    public static Matrix identityMatrix(Matrix eMatrix) {
        Matrix identityMatrix = new Matrix(eMatrix.m, eMatrix.n);
        if (eMatrix.m == eMatrix.n) {
            for (int i = 0; i < eMatrix.m; i++) {
                for (int j = 0; j < eMatrix.n; j++) {
                    if (i == j) {
                        identityMatrix.setElement(i, j, 1);
                    }
                }
            }
        }
        return identityMatrix;
    }

    public static Matrix multiplicationNumber(Matrix number, int k) {
        Matrix multiplyMatrix;
        int n = number.getVerticalLength();
        int m = number.getHorizontalLength();
        int[][] multiplyArray = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                multiplyArray[i][j] = number.getElement(i, j) * k;
            }
        }
        multiplyMatrix = new Matrix(multiplyArray);
        return multiplyMatrix;
    }

    public static Matrix multiplication(Matrix first, Matrix second) {
        Matrix multiplyMatrix;
        int n = first.getVerticalLength();
        int m = second.getHorizontalLength();
        int o = second.getVerticalLength();
        int[][] multiplyArray = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                for (int k = 0; k < o; k++) {
                    multiplyArray[i][j] += first.getElement(i, k) * second.getElement(k, j);
                }
            }
        }
        multiplyMatrix = new Matrix(multiplyArray);
        return multiplyMatrix;
    }

    public static Matrix matrixSquaring(Matrix squaring) {
        Matrix multiplyMatrix;
        int n = squaring.getVerticalLength();
        int m = squaring.getHorizontalLength();
        int[][] squaringArray = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                for (int k = 0; k < n; k++) {
                    squaringArray[i][j] += squaring.getElement(i, k) * squaring.getElement(k, j);
                }
            }
        }
        multiplyMatrix = new Matrix(squaringArray);
        return multiplyMatrix;
    }

    public static int determinant(int[][] det) {
        int n = det.length;
        if(n == 1) return det[0][0];
        int result = 0;
        int[][] detArray = new int[n-1][n-1];
        int num = 1;
        for(int i = 0; i < n; ++i){
            int x = 0, y = 0;
            for(int j = 1; j < n; ++j){
                for(int k = 0; k < n; ++k){
                    if(i == k) continue;
                    detArray[x][y] = det[j][k];
                    ++y;
                    if(y == n - 1){
                        y = 0;
                        ++x;
                    }
                }
            }
            result += num * det[0][i] * determinant(detArray);
            num *= (-1);
        }
        return result;
    }
}

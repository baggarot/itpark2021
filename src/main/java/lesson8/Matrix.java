package lesson8;

public class Matrix {

    int n;
    int m;
    int[][] matrix;

    Matrix() {
        this.n = 2;
        this.m = 2;
        this.matrix = new int[this.n][this.m];
    }

    public Matrix(int n, int m) {
        this.n = n;
        this.m = m;
        this.matrix = new int[this.n][this.m];
    }

    public Matrix(int[][] invMatrix) {
        this.n = invMatrix.length;
        this.m = invMatrix[0].length;
        this.matrix = invMatrix;
    }

    public int getElement(int n, int m) {
        return this.matrix[n][m];
    }

    public void setElement(int n, int m, int value) {
        this.matrix[n][m] = value;
    }

    public int getVerticalLength() {
        return this.matrix.length;
    }

    public int getHorizontalLength() {
        return this.matrix[0].length;
    }

    public void displayMatrix() {
        for (int i = 0; i < this.n; i++) {
            for (int j = 0; j < this.m; j++) {
                System.out.print(this.matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void randomValues() {
        for (int i = 0; i < this.n; i++) {
            for (int j = 0; j < this.m; j++) {
                this.matrix[i][j] = (int) (Math.random() * 100);
            }
        }
    }
}

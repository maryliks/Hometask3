import java.util.Random;

public class Matrix {
    private int n;
    private int m;
    private double[][] matrix;

    public Matrix(int n, int m) {
        this.m = m;
        this.n = n;
        matrix = new double[n][m];
    }

    public int getM() {
        return m;
    }

    public int getN() {
        return n;
    }

    public Matrix(int[][] matrix) {
        n = matrix.length;
        m = matrix[0].length;
        this.matrix = new double[n][m];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                this.matrix[i][j] = matrix[i][j];
    }

    public void printMatrix() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("%15f", matrix[i][j]);
            }
            System.out.println();
        }
    }


    public void initialization() {
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = random.nextDouble() + 1;
            }
        }
    }

    public double getElement(int n, int m) {
        return this.matrix[n][m];
    }

    public void setElement(int n, int m, double value) {
        this.matrix[n][m] = value;
    }

    public void symmetricMatrix() {
        Matrix symmetric = new Matrix(m, n);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                symmetric.setElement(i, j, getElement(j, i));
                System.out.printf("%15f", symmetric.getElement(i, j));
            }
            System.out.println();
        }
    }

    public void maxAndMin() {
        double max = 0;
        double min = matrix[0][0];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (max < matrix[i][j]) {
                    max = matrix[i][j];
                }
                if (min > matrix[i][j]) {
                    min = matrix[i][j];
                }
            }
        }
        System.out.println("Max:" + max);
        System.out.println("Min:" + min);
    }

    public void arithmeticAndGeometricMean() {
        double arithmeticMean = 0;
        double geometricMean = 0;
        double sum = 0;
        double multiply = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sum += matrix[i][j];
                multiply *= matrix[i][j];
            }
        }
        arithmeticMean = sum / (double) (n * m);
        geometricMean = Math.pow(multiply, 1 / (float) (n * m));
        System.out.println("Arithmetic mean: " + arithmeticMean);
        System.out.println("Geometric mean: " + geometricMean);

    }

}

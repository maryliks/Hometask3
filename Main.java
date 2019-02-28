import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n and m:");
        int n = sc.nextInt();
        int m = sc.nextInt();
        Matrix matrix=new Matrix(n,m);
        matrix.initialization();
        matrix.printMatrix();
        matrix.arithmeticAndGeometricMean();
        matrix.maxAndMin();
        matrix.symmetricMatrix();
    }
}

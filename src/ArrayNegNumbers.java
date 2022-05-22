import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class ArrayNegNumbers {
    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        System.out.println("Enter the number of rows in the matrix: ");
        int a  = Integer.parseInt(READER.readLine());

        System.out.println("Enter the number of columns in the matrix: ");
        int b  = Integer.parseInt(READER.readLine());

        int[][] matrix = new int[a][b];
        Random newRandomNumber = new Random();

        System.out.println("Generated matrix with random numbers: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = newRandomNumber.nextInt(10) + -5;
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Cells with negative numbers: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < 0) {
                    System.out.print("(" + i + ", " + j + ");");
                }
            }
        }
        System.out.println();
        System.out.println("Cells with positive numbers: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > 0) {
                    System.out.print("(" + i + ", " + j + ");");
                }
            }
        }
        System.out.println();
        System.out.println("Cells with zero: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    System.out.print("(" + i + ", " + j + ");");
                }
            }
        }
    }
}

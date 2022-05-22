import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TransposeMatrix {
    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        System.out.println("Enter the number of rows in the matrix: ");
        int a  = Integer.parseInt(READER.readLine());

        System.out.println("Enter the number of columns in the matrix: ");
        int b  = Integer.parseInt(READER.readLine());

        int[][] matrix = new int[a][b];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("Enter matrix values[" + i + "][" + j + "]:");
                matrix[i][j] = Integer.parseInt(READER.readLine());
            }
        }

        System.out.println("Entered matrix: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        int[][] transposeMatrix = new int[b][a];

        for (int i = 0; i < transposeMatrix.length; i++) {
            for (int j = 0; j < transposeMatrix[i].length; j++) {
                transposeMatrix[i][j] = matrix[j][i];
            }
        }

        System.out.println("Transpose Matrix: ");
        for (int i = 0; i < transposeMatrix.length; i++) {
            for (int j = 0; j < transposeMatrix[i].length; j++) {
                System.out.print(transposeMatrix[i][j] + " ");
            }
            System.out.println();
        }

    }

}

import java.util.Scanner;

public class DiagonalSum {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int[][] matrix = new int[3][3];

            System.out.println("Enter the elements of the 3x3 matrix:");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    matrix[i][j] = input.nextInt();
                }
            }

            int leftSum = 0;
            int rightSum = 0;
            for (int i = 0; i < 3; i++) {
                leftSum += matrix[i][i];
                rightSum += matrix[i][2 - i];
            }

            System.out.println("Left diagonal sum: " + leftSum);
            System.out.println("Right diagonal sum: " + rightSum);
        }
    }
}

package homework2106;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Avdeev_6 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(new File("/Users/nikavdeev/IdeaProjects/Avdeev_00/src/homework2106/input"));

            int n = scanner.nextInt();


            int[][] matrix1 = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    matrix1[i][j] = scanner.nextInt();
                }
            }

            scanner.nextLine();

            int[][] matrix2 = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    matrix2[i][j] = scanner.nextInt();
                }
            }

            int[][] sumMatrix = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
                }
            }

            int[][] diffMatrix = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    diffMatrix[i][j] = matrix1[i][j] - matrix2[i][j];
                }
            }

            System.out.println("Сумма матриц:");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(sumMatrix[i][j] + " ");
                }
                System.out.println();
            }

            System.out.println("Разность матриц:");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(diffMatrix[i][j] + " ");
                }
                System.out.println();
            }

        } catch (IOException e) {
            System.out.println("Файл не найден");
        }
    }
}

package homework2106;

import java.util.Scanner;

public class Avdeev_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размерность матрицы: ");
        int size = scanner.nextInt();

        System.out.println("Введите элементы первой матрицы:");
        int[][] matrix1 = readMatrix(scanner, size);

        System.out.println("Введите элементы второй матрицы:");
        int[][] matrix2 = readMatrix(scanner, size);

        int[][] sum = sumMatrices(matrix1, matrix2);
        int[][] difference = diffMatrices(matrix1, matrix2);

        System.out.println("Сумма матриц:");
        printMatrix(sum);

        System.out.println("Разность матриц:");
        printMatrix(difference);
    }

    public static int[][] readMatrix(Scanner scanner, int size) {
        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }

    public static int[][] sumMatrices(int[][] matrix1, int[][] matrix2) {
        int size = matrix1.length;
        int[][] result = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return result;
    }

    public static int[][] diffMatrices(int[][] matrix1, int[][] matrix2) {
        int size = matrix1.length;
        int[][] result = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                result[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        return result;
    }

    public static void printMatrix(int[][] matrix) {
        int size = matrix.length;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

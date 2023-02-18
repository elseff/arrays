import java.util.Random;
import java.util.Scanner;

public class Main {
    private static int cols = 0;
    private static int rows = 0;
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Rows: ");
        rows = scanner.nextInt();
        System.out.print("Columns: ");
        cols = scanner.nextInt();

        int[][] mas = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                mas[i][j] = new Random().nextInt(10);
            }
        }

        System.out.println("Our massive with random values in 0 and 10 range:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(mas[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        int[] sumByColumns = sumByColumns(mas);
        for (int i = 0; i < cols; i++) {
            System.out.println("In " + (i + 1) + " column sum is " + sumByColumns[i]);
        }

        System.out.println();

        int[] sumByRows = sumByRows(mas);
        for (int i = 0; i < rows; i++) {
            System.out.println("In " + (i + 1) + " row sum is " + sumByRows[i]);
        }

        System.out.println();

        int sum = sum(mas);
        System.out.println("Sum of all elements in this massive is " + sum);
    }

    /**
     * sum by columns in massive
     */
    private static int[] sumByColumns(int[][] mas) {
        int[] result = new int[Main.cols];
        for (int i = 0; i < Main.cols; i++) {
            int colsSum = 0;
            for (int j = 0; j < Main.rows; j++) {
                colsSum += mas[j][i];
            }
            result[i] = colsSum;
        }
        return result;
    }

    /**
     * sum by rows in massive
     */
    private static int[] sumByRows(int[][] mas) {
        int[] result = new int[Main.rows];
        for (int i = 0; i < Main.rows; i++) {
            int rowsSum = 0;
            for (int j = 0; j < Main.cols; j++) {
                rowsSum += mas[i][j];
            }
            result[i] = rowsSum;
        }
        return result;
    }

    /**
     * Sum of all elements in massive
     */
    private static int sum(int[][] mas) {
        int sum = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum += mas[i][j];
            }
        }
        return sum;
    }
}
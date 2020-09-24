package hometask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        reader.close();

        int[][] matrix = new int[n][n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = random.nextInt(200) - 100;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print
                        (matrix[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("____________________");

        SortColumn(matrix, n);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print
                        (matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void SortColumn(int[][] matrix, int n) {
        //сортировка столбцов по строке
        int tmp;
        for (int k = 0; k < n; k++) {
            for (int j = 0; j < n - 1; j++) {
                int i = 0;
                if (matrix[i][j] > matrix[i][j + 1]) {
                    for (i = 0; i < n; i++) {
                        tmp = matrix[i][j];
                        matrix[i][j] = matrix[i][j + 1];
                        matrix[i][j + 1] = tmp;
                    }
                }
            }
        }
    }
}

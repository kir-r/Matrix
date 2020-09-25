package hometask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Random;

/*Алгоритмы двумерного массива (матрицы)*/


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
        Print(matrix, n);

        SortColumn(matrix, n);
        Print(matrix, n);

        SortLine(matrix, n);
        Print(matrix, n);

        for (int l : SumElements(matrix, n))
            System.out.println(l);
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

    public static void SortLine(int[][] matrix, int n) {
        //сортировка строк по столбцу
        int tmp;
        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n - 1; i++) {
                int j = 0;
                if (matrix[i][j] > matrix[i + 1][j]) {
                    for (j = 0; j < n; j++) {
                        tmp = matrix[i][j];
                        matrix[i][j] = matrix[i + 1][j];
                        matrix[i + 1][j] = tmp;
                    }
                }
            }
        }
    }

    /*Найти сумму элементов матрицы, расположенных между первым и
    вторым положительными элементами каждой строки*/
    public static ArrayList<Integer> SumElements(int[][] matrix, int n) {
        ArrayList<Integer> listSum = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int j = 0;
            while (matrix[i][j] < 0)
                if (j < n - 1) {
                    j++;
                } else break;
            if (j < n - 1) {
                j++;
            } else break;
            while (matrix[i][j] < 0) {
                sum += matrix[i][j];
                if (j < n - 1) {
                    j++;
                } else break;
            }
            listSum.add(sum);
            sum = 0;
        }
        return listSum;
    }

    public static void Print(int[][] matrix, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print
                        (matrix[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("____________________");
    }
}
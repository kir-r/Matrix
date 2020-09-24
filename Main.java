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

        //меняем местами стоблцы
        /*int tmp;
        for (int i = 0; i < n; i++) {
            if (matrix[i][0] > matrix[i + 1][0]) {
                tmp = matrix[i][0];
                matrix[i][0] = matrix[i][1];
                matrix[i][1] = tmp;
            }
        }*/

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

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print
                        (matrix[i][j] + "\t");
            }
            System.out.println();
        }


        /*System.arrayCopy(from, fromIndex, to, toIndex, count);
        from - массив, который копируем;
        to - массив в которой копируем;
        fromIndex - индекс в массиве from начиная с которого берем элементы для копирования;
        toIndex - индекс в массиве to начиная с которого вставляем элементы;
        count - количество элементов которые берем из массива from и вставляем в массив to;
        Массив to должен иметь достаточный размер, чтобы в нем уместились все копируемые элементы*/

        /*Упорядочить строки (столбцы) матрицы в порядке возрастания значений
         * элементов k-го столбца (строки)*/

        // write your code here

    }
}

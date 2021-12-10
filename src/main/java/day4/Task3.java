package day4;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int m = 12;
        int n = 8;
        int sum = 0;
        int sumstrok = 0;
        int maxi = 0;
        Random randd = new Random();
        int[][] massiv1 = new int[m][n];
        int[] total = new int[massiv1.length];
        for (int i = 0; i < massiv1.length; i++) {
            sum = 0;
            System.out.println(" ");
            for (int y = 0; y < massiv1[i].length; y++) {
                massiv1[i][y] = randd.nextInt(50);
                System.out.print(massiv1[i][y]);
                System.out.print(" ");
                sum += massiv1[i][y];
                total[i] += massiv1[i][y];
            }
            System.out.print("// сумма - " + sum);
        }
        for (int i = 0; i < total.length; i++) {
            if (sumstrok < total[i]) {
                sumstrok = total[i];
                maxi = i;
            }
        }
        System.out.println();
        System.out.println(Arrays.toString(total));
        System.out.println(sumstrok);
        System.out.println(maxi);
    }
}
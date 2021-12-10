package day4;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] massiv = new int[100];
        Random random = new Random();
        for (int i = 0; i < massiv.length; i++) {
            int bbb = random.nextInt(10000);
            massiv[i] = bbb;
        }
        int max = massiv[0];
        int min = massiv[0];
        int nol = 0;
        int sumnol = 0;

        for (int z = 0; z < massiv.length; z++) {
            if (max < massiv[z]) {
                max = massiv[z];
            }
        }
//        for (int qwe : massiv) {
//            if (maxx <= massiv[qwe]) {
//                maxx = massiv[qwe];
//            }
//        }
        for (int q = 0; q < massiv.length; q++) {
            if (min > massiv[q]) {
                min = massiv[q];
            }
        }
        for (int zz = 0; zz < massiv.length; zz++) {
            if (massiv[zz] % 10 == 0) {
                nol++;
                sumnol = sumnol + massiv[zz];
            }
        }
        System.out.println("Наибольший элемент массива: " + max);
//        System.out.println("Наибольший элемент массива: " + maxx);
        System.out.println("Наимеьший элемент массива: " + min);
        System.out.println("Количество элементов массива, оканчивающихся на 0: " + nol);
        System.out.println("Cумма элементов массива, оканчивающихся на 0: "+ sumnol);

        System.out.println(Arrays.toString(massiv));
    }
}

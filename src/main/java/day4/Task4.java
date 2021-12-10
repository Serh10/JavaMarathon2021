package day4;

import java.util.Arrays;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int[] massiv = new int[10];
        Random random = new Random();
        int maxsum = 0;
        int stroka = 0;
        for (int i = 0; i < massiv.length; i++) {
            massiv[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(massiv));
        for (int i = 0; i < massiv.length - 2; i++) {
            int sum = 0;
            for (int j = i; j < i + 3; j++) {
                sum += massiv[j];}
                if (sum>maxsum){
                    maxsum = sum;
                    stroka = i;

            }

            System.out.println(sum);
        }
        System.out.println(" ");
        System.out.println("Максимальная сумма трех соседних = " + maxsum);
        System.out.println("Максимальная строка трех соседних = " + stroka);
    }
}


package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int razmer = scanner.nextInt();
        int[] numbers = new int[razmer];
        Random rand = new Random();

//        for (int i : numbers) {
//            int bb = rand.nextInt(razmer);
//            i = bb;


        for (int i = 0; i < razmer; i++) {
//            int bb = rand.nextInt(razmer);
//            numbers[i] = bb;
            numbers[i] = rand.nextInt(razmer);
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println("Длина массива: " + razmer);

        int b = 0;
        int bolshe = 0;
        while (true) {
            if (b >= razmer) {
                break;
            }
            if (numbers[b] > 8) {
                bolshe++;
            }
            b++;
        }
        int raven = 0;
        int raven0 = 0;
        while (true) {
            if (raven >= razmer) {
                break;
            }
            if (numbers[raven] == 1) {
                raven0++;
            }
            raven++;
        }
        int kolvochet = 0;
        int kolvo = 0;
        while (true) {
            if (kolvo >= razmer) {
                break;
            }
            if (numbers[kolvo] % 2 == 0) {
                kolvochet++;
            }
            kolvo++;
        }
        int kolvonechet = 0;
        int kolvone = 0;
        while (true) {
            if (kolvone >= razmer) {
                break;
            }
            if (numbers[kolvone] % 2 == 1) {
                kolvonechet++;
            }
            kolvone++;
        }
        int sum = 0;
        for (int y = 0; y < razmer; y++) {
            sum = sum + numbers[y];
        }

        System.out.println("Колличесво чисел больше 8: " + bolshe);
        System.out.println("Колличесво чисел равных 1: " + raven0);
        System.out.println("Колличесво четных чисел: " + kolvochet);
        System.out.println("Колличесво нечетных чисел: " + kolvonechet);
        System.out.println("Сумма всех элементов массива: " + sum);

    }
}

package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner nux = new Scanner(System.in);
        boolean i = true;
        while (i == true) {
//            System.out.println("Введите делимое: ");
            double delimoe = nux.nextDouble();
//            System.out.println("Введите делитель: ");
            double delitel = nux.nextDouble();
            if (delitel == 0) {
                break;
            }
            System.out.println(delimoe / delitel);
        }
    }
}


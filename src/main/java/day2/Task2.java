package day2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
//        Scanner nuu = new Scanner(System.in);
//        System.out.print("Введите число a: ");
//        int a = nuu.nextInt();
//        System.out.print("Введите число b: ");
//        int b = nuu.nextInt();
        int a = 50;
        int b = 5;
        if (a > b) {
            System.out.println("Некорректный ввод");
        }
        for (int i = a+1; i < b; i++) {
            if (i % 5 == 0 && i % 10 != 0) {
                System.out.print(i);
                System.out.print(" ");
            }
        }
    }
}

package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner nuu1 = new Scanner(System.in);
        System.out.print("Введите число a: ");
        int a = nuu1.nextInt();
        System.out.print("Введите число b: ");
        int b = nuu1.nextInt();
        if (a > b) {
            System.out.println("Некорректный ввод");
        }
        while (a <= b) {
            if (a % 5 == 0 && a % 10 != 0) {
                System.out.println(a);
            }
            a++;
        }
    }
}

package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner stage = new Scanner(System.in);
//       System.out.print("Введите колличество этажей в доме: ");
        int kollichestvoStage = stage.nextInt();
        if (kollichestvoStage >= 1 && kollichestvoStage <= 4) {
            System.out.println("Малоэтажный дом");
        } else if (kollichestvoStage >= 5 && kollichestvoStage <= 8) {
            System.out.println("Среднеэтажный дом");
        } else if (kollichestvoStage >= 9) {
            System.out.println("Многоэтажный дом");
        } else {
            System.out.println("Ошибка ввода");
        }
    }
}

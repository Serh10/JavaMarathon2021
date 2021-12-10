package day0;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner city = new Scanner(System.in);
        System.out.println("Введите название города ");
        String cit = city.nextLine();
        while (cit != "stop") {
            switch (cit) {
                case "Москва":
                    System.out.println("Россия");
                    break;
                case "stop":
                    break;
                default:
                    System.out.println("Неккоректный город");
                    break;

            }
        }
    }
}
package ru.skypro;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        tusk2 ();
    }

    public static void tusk1() {
        printIsLeapYear(2020);
    }
    public static void printIsLeapYear(int year) {
        boolean leapYear = isLeap(year);
        if (leapYear) {
            System.out.println(year + " - Високосный год");
        } else {
            System.out.println(year + " - Не високосный год");
        }
    }
    public static boolean isLeap(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    public static void tusk2() {
        printVersionApplication(0, 2015);
    }
    public static int printVersionApplication(int clientOS, int deviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (clientOS == 0) {
            if (deviceYear < currentYear) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                return 1;
            } else {
                System.out.println("Установите обычную версию приложения для iOS по ссылке");
                return 0;
            }
        } else {
        } if (deviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
            return 1;
        } else {
            System.out.println("Установите обычную версию приложения для Android по ссылке");
            return 0;
        }
    }
}

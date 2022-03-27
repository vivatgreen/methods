package ru.skypro;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        tusk1();
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
        }
        if (deviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
            return 1;
        } else {
            System.out.println("Установите обычную версию приложения для Android по ссылке");
            return 0;
        }
    }

    public static void tusk3() {
        System.out.println("Потребуется дней: " + calculatedDeliveryTime(95));
    }

    public static int calculatedDeliveryTime(int deliveryDistance) {
        int deliveryTime = 0;
        if (deliveryDistance <= 20) {
            deliveryTime += 1;
        }
        if (deliveryDistance >= 20 && deliveryDistance <= 60) {
            deliveryTime += 2;
        }
        if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            deliveryTime += 3;
        }
        return deliveryTime;
    }

    public static void tusk4() {
        String str = "aabccddefgghiijjkk";
        validateString(str);
    }

    public static void validateString(String str) {
        char[] carray = str.toCharArray();
        System.out.println("Строка в виде: " + str);
        System.out.print("Повторяющиеся символы в приведенной выше строке являются: ");
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (carray[i] == carray[j]) {
                    System.out.print(carray[j] + " ");
                    break;
                }

            }
        }
    }
    public static void tusk5(){
        String s = "3, 2, 1, 6, 5";
        reverse(s);
    }
    public static void reverse(String s) {
        char[] ch = s.toCharArray();
        for (int i = ch.length - 1; i >= 0; i--) {
            System.out.print(ch[i]);
        }

    }

}

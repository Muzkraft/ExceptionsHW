package org.example;

import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class HW2 {
    /*Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение.
     Ввод текста вместо числа не должно приводить к падению приложения, вместо этого,
     необходимо повторно запросить у пользователя ввод данных.*/

    static void task1() {
        for (int i = 0; i < 5; i++) {
            try {
                Scanner sc = new Scanner(System.in);
                sc.useLocale(Locale.ENGLISH);
                System.out.print("Введите дробное число: ");
                double number = sc.nextFloat();
                System.out.println(number);
            } catch (InputMismatchException inputMismatchException) {
                System.out.print("Неверный ввод! ");
            }
        }
    }

    /*Задание 2 */
    static void task2() {
        try {
            int d = 0;
            int[] intArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
            int catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
    }

    /* Задание 3 */
    static void task3() {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = {1, 2};
            abc[3] = 9;

        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("Файл не найден");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
    }

    public static void printSum(Integer a, Integer b) throws FileNotFoundException {
        System.out.println(a + b);
    }

    /*Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
     Пользователю должно показаться сообщение, что пустые строки вводить нельзя.*/
    static void task4() {
        boolean started = true;
        while (started) {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.print("Введите строку: ");
                String str = sc.nextLine();
                if (str.isEmpty()) throw new Exception();
                System.out.println(str);
            } catch (Exception e) {
                System.out.print("Пустые строки вводить нельзя! ");
            }
        }
    }
}


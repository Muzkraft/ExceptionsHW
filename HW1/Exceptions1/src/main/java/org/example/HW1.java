package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HW1 {

    /* 1) Реализуйте 3 метода, чтобы в каждом из них получить разные исключения */
    public static void divide() {
        int[] numbers = new int[2];
        boolean started = true;

        while (started) {
            try {
                Scanner in = new Scanner(System.in);
                System.out.println("Введите делимое: ");
                numbers[0] = in.nextInt();
                System.out.println("Введите делитель: ");
                numbers[1] = in.nextInt();
                System.out.println(numbers[0] / numbers[1]);
                numbers[3] = in.nextInt();

            } catch (InputMismatchException inputMismatchException) {
                System.out.println(inputMismatchException + ": Вводить нужно числа, а не вот это вот всё!");
            } catch (ArithmeticException arithmeticException) {
                System.out.println(arithmeticException + ": На ноль делить низзя!");
            } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                System.out.println(indexOutOfBoundsException + ": Эта ошибка предусмотрена разработчиком." +
                        "Не обращайте внимание!!!!! Идём дальше...");
            } finally {
                started = false;
            }
        }
    }

    /* 2) Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
     и возвращающий новый массив, каждый элемент которого
     равен разности элементов двух входящих массивов в той же ячейке.
     Если длины массивов не равны, необходимо как-то оповестить пользователя.*/

    static int[] task2(int[] arr1, int[] arr2) {
        int[] resArr = new int[0];
        try {
            resArr = new int[arr1.length];
            for (int i = 0; i < arr1.length; i++) {
                resArr[i] = arr1[i] - arr2[i];
            }
        } catch (Exception e) {
            if (arr1.length != arr2.length) {
                System.out.println("Длины массивов не равны!");
            }
        }
        return resArr;
    }

    /* 3) Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
     и возвращающий новый массив, каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке.
     Если длины массивов не равны, необходимо как-то оповестить пользователя.*/

    static int[] task3(int[] arr1, int[] arr2) {
        int[] resArr = new int[0];
        try {
            resArr = new int[arr1.length];
            for (int i = 0; i < arr1.length; i++) {
                resArr[i] = arr1[i] / arr2[i];
            }
        } catch (Exception e) {
            if (arr1.length != arr2.length) {
                System.out.println("Длины массивов не равны!");
            }
        }
        return resArr;
    }

    static void printArray(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}

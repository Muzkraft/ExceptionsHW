package org.example;

public class Main {
    public static void main(String[] args) {

        HW1.divide();

        int[] arr1 = new int[] {5,4,3,2,1,8};
        int[] arr2 = new int[] {1,2,3,4,5};

        HW1.printArray(HW1.task2(arr1, arr2));
        System.out.println();
        HW1.printArray(HW1.task3(arr1, arr2));
    }
}
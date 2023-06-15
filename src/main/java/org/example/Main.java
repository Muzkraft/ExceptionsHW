package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Нажмите Enter для начала, или наберите 'exit' для выхода...");

        while (!sc.nextLine().equals("exit")) {

            HW3.input();
            System.out.println("Нажмите Enter для продолжения, или наберите 'exit' для выхода...");
        }
    }
}
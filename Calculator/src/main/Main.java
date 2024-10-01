package main;

import main.operations.*;
import main.util.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;

        ScreenUtil.clearScreen();

        while (flag) {
            System.out.println("\nConsole Calculator");
            System.out.println("------------------");
            ScreenUtil.displayMenu();

            try {
                int operation = InputUtil.getOperation(scanner, 1, 5);
                ScreenUtil.clearScreen();

                switch (operation) {
                    case 1 -> ArithmeticOperations.perform(scanner);
                    case 2 -> TrigonometricOperations.perform(scanner);
                    case 3 -> ScientificOperations.perform(scanner);
                    case 4 -> ConversionOperations.perform(scanner);
                    case 5 -> {
                        ScreenUtil.clearScreen();
                        System.out.println("Exiting the calculator. Goodbye!");
                        flag = false;
                    }
                }

                if (flag) {
                    System.out.println("------------------");
                    flag = InputUtil.askContinue(scanner);
                    ScreenUtil.clearScreen();
                }

            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                scanner.nextLine();
            }
        }
    }
}


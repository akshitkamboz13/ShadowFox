package main.operations;

import main.util.InputUtil;
import main.util.ScreenUtil;

import java.util.Scanner;

public class ArithmeticOperations {

    public static void perform(Scanner scanner) {
        ScreenUtil.displayArithmeticMenu();
        try {
            int arithmeticOperation = InputUtil.getOperation(scanner, 1, 6);
            if (arithmeticOperation == 6) return;

            ScreenUtil.clearScreen();

            double num1 = InputUtil.getDouble(scanner, "Enter the first number: ");
            double num2 = InputUtil.getDouble(scanner, "Enter the second number: ");

            switch (arithmeticOperation) {
                case 1 -> System.out.println("Addition: " + (num1 + num2));
                case 2 -> System.out.println("Subtraction: " + (num1 - num2));
                case 3 -> System.out.println("Multiplication: " + (num1 * num2));
                case 4 -> {
                    if (num2 != 0) {
                        System.out.println("Division: " + (num1 / num2));
                    } else {
                        System.out.println("Cannot divide by zero.");
                    }
                }
                case 5 -> System.out.println("Modulus: " + (num1 % num2));
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

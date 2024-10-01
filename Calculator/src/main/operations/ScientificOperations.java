package main.operations;

import main.util.InputUtil;
import main.util.ScreenUtil;

import java.util.Scanner;

public class ScientificOperations {

    public static void perform(Scanner scanner) {
        ScreenUtil.displayScientificMenu();
        try {
            int sciOperation = InputUtil.getOperation(scanner, 1, 7);
            if (sciOperation == 7) return;

            ScreenUtil.clearScreen();

            double num = InputUtil.getDouble(scanner, "Enter the number: ");

            switch (sciOperation) {
                case 1 -> System.out.println("Square: " + (num * num));
                case 2 -> System.out.println("Square Root: " + Math.sqrt(num));
                case 3 -> System.out.println("Cube: " + (num * num * num));
                case 4 -> System.out.println("Cube Root: " + Math.cbrt(num));
                case 5 -> System.out.println("Exponential: " + Math.exp(num));
                case 6 -> System.out.println("Logarithm: " + Math.log(num));
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

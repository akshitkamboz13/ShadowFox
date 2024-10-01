package main.operations;

import main.util.InputUtil;
import main.util.ScreenUtil;

import java.util.Scanner;

public class TrigonometricOperations {

    public static void perform(Scanner scanner) {
        ScreenUtil.displayTrigonometricMenu();
        try {
            int trigOperation = InputUtil.getOperation(scanner, 1, 4);
            if (trigOperation == 4) return;

            ScreenUtil.clearScreen();

            double angle = InputUtil.getDouble(scanner, "Enter the angle in radians: ");

            switch (trigOperation) {
                case 1 -> System.out.println("Sine: " + Math.sin(angle));
                case 2 -> System.out.println("Cosine: " + Math.cos(angle));
                case 3 -> System.out.println("Tangent: " + Math.tan(angle));
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

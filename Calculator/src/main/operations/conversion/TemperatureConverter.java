package main.operations.conversion;

import main.util.InputUtil;
import main.util.ScreenUtil;

import java.util.Scanner;

public class TemperatureConverter {

    public static void perform(Scanner scanner) {
        ScreenUtil.displayTemperatureMenu();
        try {
            int tempOp = InputUtil.getOperation(scanner, 1, 3);
            if (tempOp == 3) return;

            double temp = InputUtil.getDouble(scanner, "Enter the temperature: ");

            switch (tempOp) {
                case 1 -> System.out.println("Celsius to Fahrenheit: " + (temp * 9 / 5 + 32));
                case 2 -> System.out.println("Fahrenheit to Celsius: " + ((temp - 32) * 5 / 9));
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

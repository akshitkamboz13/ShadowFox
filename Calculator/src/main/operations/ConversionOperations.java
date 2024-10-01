package main.operations;

import main.operations.conversion.CurrencyConverter;
import main.operations.conversion.TemperatureConverter;
import main.util.InputUtil;
import main.util.ScreenUtil;

import java.util.Scanner;

public class ConversionOperations {

    public static void perform(Scanner scanner) {
        ScreenUtil.displayConversionMenu();
        try {
            int conversion = InputUtil.getOperation(scanner, 1, 4);
            if (conversion == 3) return;

            ScreenUtil.clearScreen();

            switch (conversion) {
                case 1 -> TemperatureConverter.perform(scanner);
                case 2 -> CurrencyConverter.perform(scanner);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}


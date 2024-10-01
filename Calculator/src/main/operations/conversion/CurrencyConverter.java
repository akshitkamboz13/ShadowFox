package main.operations.conversion;

import main.util.InputUtil;
import main.util.ScreenUtil;

import java.util.Scanner;

public class CurrencyConverter {

    public static void perform(Scanner scanner) {
        ScreenUtil.displayCurrencyMenu();
        try {
            int currencyOp = InputUtil.getOperation(scanner, 1, 3);
            if (currencyOp == 3) return;

            double amount = InputUtil.getDouble(scanner, "Enter the amount: ");
            switch (currencyOp) {
                case 1 -> System.out.println("USD to INR: " + (amount * 83.98));
                case 2 -> System.out.println("INR to USD: " + (amount / 83.98));
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

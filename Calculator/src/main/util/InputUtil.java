package main.util;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputUtil {

    public static int getOperation(Scanner scanner, int min, int max) throws InputMismatchException {
        int operation = scanner.nextInt();
        if (operation < min || operation > max) {
            throw new InputMismatchException("Invalid operation. Choose between " + min + " and " + max + ".");
        }
        return operation;
    }

    public static double getDouble(Scanner scanner, String prompt) throws InputMismatchException {
        System.out.print(prompt);
        return scanner.nextDouble();
    }

    public static boolean askContinue(Scanner scanner) {
        System.out.println("Do you want to perform another operation? (y for yes, n for no)");
        String choice = scanner.next();
        return choice.equalsIgnoreCase("y");
    }
}

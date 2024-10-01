package main.util;

public class ScreenUtil {

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void displayMenu() {
        System.out.println("1. Arithmetic Operations");
        System.out.println("2. Trigonometric Operations");
        System.out.println("3. Scientific Operations");
        System.out.println("4. Converter");
        System.out.println("5. Exit");
    }

    public static void displayArithmeticMenu() {
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Modulus");
        System.out.println("6. Back to Main Menu");
    }

    public static void displayTrigonometricMenu() {
        System.out.println("1. Sine");
        System.out.println("2. Cosine");
        System.out.println("3. Tangent");
        System.out.println("4. Back to Main Menu");
    }

    public static void displayScientificMenu() {
        System.out.println("1. Square");
        System.out.println("2. Square Root");
        System.out.println("3. Cube");
        System.out.println("4. Cube Root");
        System.out.println("5. Exponential");
        System.out.println("6. Logarithm");
        System.out.println("7. Back to Main Menu");
    }

    public static void displayConversionMenu() {
        System.out.println("1. Temperature Converter");
        System.out.println("2. Currency Converter");
        System.out.println("3. Back to Main Menu");
    }

    public static void displayCurrencyMenu() {
        System.out.println("1. USD to INR");
        System.out.println("2. INR to USD");
        System.out.println("3. Back to Main Menu");
    }

    public static void displayTemperatureMenu() {
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("3. Back to Main Menu");
    }
}


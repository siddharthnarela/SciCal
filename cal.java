import java.util.Scanner;

public class ScientificCalculator {

    private static double add(double a, double b) {
        return a + b;
    }

    private static double subtract(double a, double b) {
        return a - b;
    }

    private static double multiply(double a, double b) {
        return a * b;
    }

    private static double divide(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Error: Division by zero");
            return Double.NaN;
        }
    }

    private static double sqrt(double a) {
        return Math.sqrt(a);
    }

    private static double power(double a, double b) {
        return Math.pow(a, b);
    }

    private static double sin(double angle) {
        return Math.sin(Math.toRadians(angle));
    }

    private static double cos(double angle) {
        return Math.cos(Math.toRadians(angle));
    }

    private static double tan(double angle) {
        return Math.tan(Math.toRadians(angle));
    }

    private static double log(double a) {
        if (a > 0) {
            return Math.log10(a);
        } else {
            System.out.println("Error: Logarithm of non-positive number");
            return Double.NaN;
        }
    }

    private static void showMenu() {
        System.out.println("Scientific Calculator");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("5. Square Root");
        System.out.println("6. Power");
        System.out.println("7. Sine");
        System.out.println("8. Cosine");
        System.out.println("9. Tangent");
        System.out.println("10. Logarithm (base 10)");
        System.out.println("0. Exit");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true) {
            showMenu();
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            if (choice == 0) {
                System.out.println("Exiting...");
                break;
            }

            double num1, num2;
            switch (choice) {
                case 1:
                    System.out.print("Enter first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = scanner.nextDouble();
                    System.out.println("Result: " + add(num1, num2));
                    break;
                case 2:
                    System.out.print("Enter first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = scanner.nextDouble();
                    System.out.println("Result: " + subtract(num1, num2));
                    break;
                case 3:
                    System.out.print("Enter first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = scanner.nextDouble();
                    System.out.println("Result: " + multiply(num1, num2));
                    break;
                case 4:
                    System.out.print("Enter first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = scanner.nextDouble();
                    System.out.println("Result: " + divide(num1, num2));
                    break;
                case 5:
                    System.out.print("Enter number: ");
                    num1 = scanner.nextDouble();
                    System.out.println("Result: " + sqrt(num1));
                    break;
                case 6:
                    System.out.print("Enter base: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter exponent: ");
                    num2 = scanner.nextDouble();
                    System.out.println("Result: " + power(num1, num2));
                    break;
                case 7:
                    System.out.print("Enter angle in degrees: ");
                    num1 = scanner.nextDouble();
                    System.out.println("Result: " + sin(num1));
                    break;
                case 8:
                    System.out.print("Enter angle in degrees: ");
                    num1 = scanner.nextDouble();
                    System.out.println("Result: " + cos(num1));
                    break;
                case 9:
                    System.out.print("Enter angle in degrees: ");
                    num1 = scanner.nextDouble();
                    System.out.println("Result: " + tan(num1));
                    break;
                case 10:
                    System.out.print("Enter number: ");
                    num1 = scanner.nextDouble();
                    System.out.println("Result: " + log(num1));
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
        scanner.close();
    }
}

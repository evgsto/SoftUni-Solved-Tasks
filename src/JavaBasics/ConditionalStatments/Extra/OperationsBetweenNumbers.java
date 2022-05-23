package JavaBasics.ConditionalStatments.Extra;


import java.util.Scanner;

public class OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1 = Double.parseDouble(scanner.nextLine());
        double num2 = Double.parseDouble(scanner.nextLine());
        String operator = scanner.next();
        double result = 0;


        switch (operator) {
            case "+":
                String or = "unknown";
                result = num1 + num2;
                if (result % 2 == 0) {
                    or = "even";
                } else {
                    or = "odd";
                }
                System.out.printf("%.0f %s %.0f = %.0f - %s", num1, operator, num2, result, or);
                break;
            case "-":

                result = num1 - num2;
                if (result % 2 == 0) {
                    or = "even";
                } else {
                    or = "odd";
                }
                System.out.printf("%.0f %s %.0f = %.0f - %s ", num1, operator, num2, result, or);
                break;
            case "*":
                result = num1 * num2;
                if (result % 2 == 0) {
                    or = "even";
                } else {
                    or = "odd";
                }
                System.out.printf("%.0f %s %.0f = %.0f - %s ", num1, operator, num2, result, or);
                break;
            case "/":
                if (num2 == 0) {
                    System.out.printf("Cannot divide %.0f by zero", num1);
                } else {
                    result = num1 / num2;
                    System.out.printf("%.0f %s %.0f = %.2f ", num1, operator, num2, result);
                }
                break;
            case "%":
                if (num2 == 0) {
                    System.out.printf("Cannot divide %.0f by zero ", num1);
                } else {
                    result = num1 % num2;
                    System.out.printf("%.0f %s %.0f = %.0f ", num1, operator, num2, result);
                }
                break;

        }


    }
}

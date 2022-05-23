package JavaBasics.ConditionalStatments.Lab;

import java.util.Scanner;

public class AreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String form = scanner.nextLine();
        //square, rectangle, circle или triangle
        double formula = 0;
        if (form.equals("square")) {
            double a = Double.parseDouble(scanner.nextLine());
            formula = a * a;
            System.out.printf("%.3f", formula);
        } else if (form.equals("rectangle")) {
            double a = Double.parseDouble(scanner.nextLine());
            double b = Double.parseDouble(scanner.nextLine());
            formula = a * b;
            System.out.printf("%.3f", formula);
        } else if (form.equals("circle")) {
            double a = Double.parseDouble(scanner.nextLine());
            formula = Math.PI * Math.pow(a, 2);
            System.out.printf("%.3f", formula);
        } else if (form.equals("triangle")) {
            double a = Double.parseDouble(scanner.nextLine());
            double ha = Double.parseDouble(scanner.nextLine());
            formula = a * ha / 2;
            System.out.printf("%.3f", formula);
        }
    }
}
package JavaBasics.ConditionalStatments.Exercises;

import java.util.Scanner;

public class GodzillaKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int statist = Integer.parseInt(scanner.nextLine());
        double statistCloth = Double.parseDouble(scanner.nextLine());
        double decor = budget * 0.10;

        if (statist >= 150) {
            statistCloth = statistCloth - (statistCloth * 0.10);
        }
        double sum = decor + statistCloth*statist;
        if (sum <= budget) {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", Math.abs(sum - budget));
        } else {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", Math.abs(sum - budget));
        }

    }
}

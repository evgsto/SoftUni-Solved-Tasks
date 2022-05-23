package JavaBasics.ConditionalStatments.Extra;

import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        double spend = 0;
        String dist = "unknown";
        String rest = "unknown";
        if (budget <= 100) {
            switch (season) {
                case "summer":
                    spend = budget - (0.30 * budget);
                    dist = "Camp";
                    rest = "Bulgaria";
                    break;
                case "winter":
                    spend = budget - 0.70 * budget;
                    dist = "Hotel";
                    rest = "Bulgaria";
                    break;
            }
        } else if (budget <= 1000) {
            switch (season) {
                case "summer":
                    spend = budget - (0.40 * budget);
                    dist = "Camp";
                    rest = "Balkans";
                    break;
                case "winter":
                    spend = budget - 0.80 * budget;
                    dist = "Hotel";
                    rest = "Balkans";
                    break;
            }
        } else {
            spend = budget - 0.90 * budget;
            dist = "Hotel";
            rest = "Europe";
        }
        System.out.printf("Somewhere in %s%n", rest);
        System.out.printf("%s - %.2f", dist, budget - spend);
    }


}

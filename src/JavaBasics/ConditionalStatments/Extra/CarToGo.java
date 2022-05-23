package JavaBasics.ConditionalStatments.Extra;

import java.util.Scanner;

public class CarToGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.next());
        String season = scanner.next();
        String carClass = "unknown";
        String carStyle = "unknown";
        double price = 0;

        if (budget <= 100) {
            carClass = "Economy class";
            switch (season) {
                case "Summer":
                    carStyle = "Cabrio";
                    price = budget * 0.35;
                    break;
                case "Winter":
                    carStyle = "Jeep";
                    price = budget * 0.65;
                    break;
            }
        } else if (budget > 100 && budget <= 500) {
            carClass = "Compact class";
            switch (season) {
                case "Summer":
                    carStyle = "Cabrio";
                    price = budget * 0.45;
                    break;
                case "Winter":
                    carStyle = "Jeep";
                    price = budget * 0.80;
                    break;
            }
        } else {
            carClass = "Luxury class";
            switch (season) {
                case "Summer":
                case "Winter":
                    carStyle = "Jeep";
                    price = budget * 0.90;
                    break;
            }
        }
        System.out.println(carClass);
        System.out.printf("%s - %.2f",carStyle,price);
    }


}

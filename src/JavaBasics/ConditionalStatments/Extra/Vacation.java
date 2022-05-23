package JavaBasics.ConditionalStatments.Extra;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String hotel = "";
        String place = "";
        double price = 0;

        if (budget <= 1000) {
            hotel = "Camp";
            switch (season) {
                case "Summer":
                    price = budget * 0.65;
                    place = "Alaska";
                    break;
                case "Winter":
                    price = budget * 0.45;
                    place = "Morocco";
                    break;
            }

        } else if (budget <= 3000) {
            hotel = "Hut";
            switch (season) {
                case "Summer":
                    price = budget * 0.80;
                    place = "Alaska";
                    break;
                case "Winter":
                    price = budget * 0.60;
                    place = "Morocco";
                    break;
            }
        } else {
            hotel = "Hotel";
            price = budget * 0.90;
            switch (season) {
                case "Summer":
                    place = "Alaska";
                    break;
                case "Winter":
                    place = "Morocco";
                    break;
            }

        }
        System.out.printf("%s - %s - %.2f",place,hotel,price);

    }

}


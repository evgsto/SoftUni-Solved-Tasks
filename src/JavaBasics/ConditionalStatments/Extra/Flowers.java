package JavaBasics.ConditionalStatments.Extra;

import java.util.Scanner;

public class Flowers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int chrysanthemums = Integer.parseInt(scanner.nextLine());
        int roses = Integer.parseInt(scanner.nextLine());
        int tulips = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        String holiday = scanner.nextLine();

        double priceChrysanthemums = 0;
        double priceRoses = 0;
        double priceTulips = 0;

        double sum = 0;
        double discount = 0;

        switch (season) {
            case "Spring":
                if (tulips > 7) {
                    discount += 0.05;
                }
                priceChrysanthemums = 2.00;
                priceRoses = 4.10;
                priceTulips = 2.50;
                break;
            case "Summer":
                priceChrysanthemums = 2.00;
                priceRoses = 4.10;
                priceTulips = 2.50;

                break;

            case "Autumn":
                priceChrysanthemums = 3.75;
                priceRoses = 4.50;
                priceTulips = 4.15;
                break;

            case "Winter":
                priceChrysanthemums = 3.75;
                priceRoses = 4.50;
                priceTulips = 4.15;
                if (roses >= 10) {
                    discount += 0.10;
                }
                break;
        }

        if (holiday.equals("Y")) {
            priceChrysanthemums += priceChrysanthemums * 0.15;
            priceRoses += priceRoses * 0.15;
            priceTulips += priceTulips * 0.15;
        }
        sum = (chrysanthemums * priceChrysanthemums + roses * priceRoses + tulips * priceTulips);
        sum = sum - (sum * discount);

        if (chrysanthemums + roses + tulips > 20) {
            sum = sum - (sum * 0.20);
        }

        System.out.printf("%.2f", sum + 2.00);

    }
}

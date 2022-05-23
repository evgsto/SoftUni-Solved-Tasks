package JavaBasics.ConditionalStatments.Extra;

import java.util.Scanner;

public class TruckDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String season = scanner.nextLine();
        double kilometers = Integer.parseInt(scanner.nextLine());
        double priceKm = 0;

        if (kilometers<=5000) {
            switch (season) {
                case "Summer":
                    priceKm = 0.90;
                    break;
                case "Winter":
                    priceKm = 1.05;
                    break;
                case "Spring":
                case "Autumn":
                    priceKm = 0.75;
                    break;
            }
        }else if (kilometers<=10000) {
            switch (season) {
                case "Summer":
                    priceKm =1.10;
                    break;
                case "Winter":
                    priceKm=1.25;
                    break;
                case "Spring":
                case "Autumn":
                    priceKm=0.95;
                    break;
            }
        }else {
            priceKm = 1.45;
        }
        double sum = 4*(kilometers*priceKm);
        System.out.printf("%.2f",sum -(sum*0.10));
    }
}

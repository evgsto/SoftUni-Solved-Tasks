package JavaBasics.ConditionalStatments.Extra;

import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());
        int rent = 0;
        double disc = 0;
        double bonus = 0;

        switch (season) {
            case "Summer":
            case "Autumn":
                rent = 4200;
                break;
            case "Spring":
                rent = 3000;
                break;
            case "Winter":
                rent = 2600;
                break;
        }
        if (count % 2 == 0) {
            bonus = 0.05;
        }
        if (season.equals("Autumn")) {
            bonus = 0;
        }
        if (count <= 6) {
            disc = 0.10 ;
        } else if (count <= 11) {
            disc = 0.15 ;
        } else {
            disc = 0.25 ;
        }

        double sum = rent - (rent * disc)-(rent - (rent * disc))*bonus;


        if (budget >= sum) {
            System.out.printf("Yes! You have %.2f leva left.", budget - sum);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", Math.abs(budget - sum));
        }

    }
}

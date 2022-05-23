package JavaBasics.ConditionalStatments.Extra;

import java.util.Scanner;

public class MatchTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String category = scanner.nextLine();
        int people = Integer.parseInt(scanner.nextLine());
        double transport = 0;

        if (people >= 1 && people <= 4) {
            transport = budget * 0.75;
        } else if (people > 4 && people <= 9) {
            transport = budget * 0.60;
        } else if (people > 9 && people <= 24) {
            transport = budget * 0.50;
        } else if (people > 24 && people <= 49) {
            transport = budget * 0.40;
        } else {
            transport = budget * 0.25;
        }
        double finalPrice = budget - transport;
        double room = 0;
        switch (category) {
            case "VIP":
                room = 499.99*people;
                if (finalPrice >= room) {
                    System.out.printf("Yes! You have %.2f leva left.", finalPrice - room);
                } else {
                    System.out.printf("Not enough money! You need %.2f leva.", room - finalPrice);
                }
                break;

            case "Normal":
                room = 249.99*people;
                if (finalPrice >= room) {
                    System.out.printf("Yes! You have %.2f leva left.", finalPrice - room);
                } else {
                    System.out.printf("Not enough money! You need %.2f leva.", room - finalPrice);
                }
                break;

        }

    }
}

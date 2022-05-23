package JavaBasics.TEST;

import java.util.Scanner;

public class VetParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());
        double ticketPrice = 0;
        double daySum = 0;
        double totalSum = 0;
        int dayCount = 0;

        for (int i = 1; i <= days; i++) {

            dayCount++;
            for (int j = 1; j <= hours; j++) {
                if (i % 2 == 0 && j % 2 != 0) {
                    ticketPrice = 2.50;
                } else if (i % 2 != 0 && j % 2 == 0) {
                    ticketPrice = 1.25;
                } else {
                    ticketPrice = 1.00;
                }
                daySum += ticketPrice ;




            }
            System.out.printf("Day: %d - %.2f leva%n", dayCount, daySum);
            totalSum += daySum;

            daySum = 0;

        }
        System.out.printf("Total: %.2f leva", totalSum);

    }
}

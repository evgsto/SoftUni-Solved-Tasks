package JavaBasics.WhileLoop.Extra;

import java.util.Scanner;

public class ReportSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int endSum = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        double sumCash = 0;
        double sumCard = 0;
        int cashCount = 0;
        int cardCount = 0;
        double totalSum = 0;
        int counter = 0;
        boolean isCollected = false;

        while (!input.equals("End")) {
            counter++;
            int transaction = Integer.parseInt(input);

            if (counter % 2 != 0) {     //първо плащане - плащяне в брой
                if (transaction > 100) {
                    System.out.println("Error in transaction!");
                } else {
                    sumCash += transaction;
                    cashCount++;
                    System.out.println("Product sold!");
                }

            } else {    // второ плащане - с карта ;
                if (transaction < 10) {
                    System.out.println("Error in transaction!");
                } else {
                    sumCard += transaction;
                    cardCount++;
                    System.out.println("Product sold!");
                }

            }

            totalSum = sumCard + sumCash;
            if (totalSum >= endSum) {
                System.out.printf("Average CS: %.2f%n", sumCash / cashCount);
                System.out.printf("Average CC: %.2f", sumCard / cardCount);
                isCollected = true;
                break;
            }
            input = scanner.nextLine();
        }
        if (!isCollected) {
            System.out.println("Failed to collect required money for charity.");
        }

    }
}

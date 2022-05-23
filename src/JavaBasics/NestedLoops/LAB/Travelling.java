package JavaBasics.NestedLoops.LAB;

import java.util.Scanner;

public class Travelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String destination = scanner.nextLine();
        double sum = 0;
        boolean isGoing = false;

        while (!destination.equals("End")) {

            double minBudjet = Double.parseDouble(scanner.nextLine());

            while (minBudjet >= sum) {
                double input = Double.parseDouble(scanner.nextLine());
                sum += input;
                if (sum >= minBudjet) {
                    isGoing = true;
                    break;
                }

            }
            if (isGoing) {
                System.out.printf("Going to %s!%n",destination);
                isGoing=false;
                sum= 0;
            }
            destination = scanner.nextLine();
        }

    }
}

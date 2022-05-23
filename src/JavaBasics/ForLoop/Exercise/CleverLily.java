package JavaBasics.ForLoop.Exercise;

import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        double washingMachine = Double.parseDouble(scanner.nextLine());
        int toyPrice = Integer.parseInt(scanner.nextLine());
        int evenBD = 0;
        int oddBD = 0;
        int money = 0;
        int moneyToys = 0;
        for (int i = 1; i <= age; i++) {
            if (i % 2 == 0) {
                evenBD++;
                money += 10 * i / 2;
            } else {
                oddBD++;
            }
        }
        moneyToys = oddBD * toyPrice;
        money = money - evenBD + moneyToys;

        if (money >= washingMachine) {
            System.out.printf("Yes! %.2f", money - washingMachine);
        } else {
            System.out.printf("No! %.2f", washingMachine - money);
        }
    }
}

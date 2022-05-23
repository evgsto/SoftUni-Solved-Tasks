package JavaBasics.ConditionalStatments.Exercises;

import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //•	Видеокарта – 250 лв./бр.
        //•	Процесор – 35% от цената на закупените видеокарти/бр.
        //•	Рам памет – 10% от цената на закупените видеокарти/бр.

        double budget = Double.parseDouble(scanner.nextLine());
        int numVideo = Integer.parseInt(scanner.nextLine());
        int numCpu = Integer.parseInt(scanner.nextLine());
        int numRam = Integer.parseInt(scanner.nextLine());
        double disc = 0;

        double CpuPrice = (numVideo * 250) * 0.35;
        double RamPrice = (numVideo * 250) * 0.10;

        double sum = numVideo * 250 + numCpu * CpuPrice + numRam * RamPrice - disc;

        if (numVideo > numCpu) {
            disc = sum * 0.15;
        }
         sum = numVideo * 250 + numCpu * CpuPrice + numRam * RamPrice - disc;
        if (budget >= sum) {
            System.out.printf("You have %.2f leva left!", budget - sum);
        } else {
            System.out.printf("Not enough money! You need %.2f leva more!", Math.abs(budget - sum));
        }
    }
}

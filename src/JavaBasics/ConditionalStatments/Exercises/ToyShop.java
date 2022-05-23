package JavaBasics.ConditionalStatments.Exercises;

import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //•	Пъзел - 2.60 лв.
        //•	Говореща кукла - 3 лв.
        //•	Плюшено мече - 4.10 лв.
        //•	Миньон - 8.20 лв.
        //•	Камионче - 2 лв.
        double travelPrice = Double.parseDouble(scanner.nextLine());
        int puzzle = Integer.parseInt(scanner.nextLine());
        int doll = Integer.parseInt(scanner.nextLine());
        int bear = Integer.parseInt(scanner.nextLine());
        int minion = Integer.parseInt(scanner.nextLine());
        int truck = Integer.parseInt(scanner.nextLine());
        int count = puzzle + doll + bear + minion + truck;
        double sum = puzzle * 2.60 + doll * 3.00 + bear * 4.10 + minion * 8.20 + truck * 2.00;


        if (count >= 50) {
            sum = sum - (sum * 0.25);

        }
        sum = sum - (sum * 0.10);

        if (sum >= travelPrice) {
            System.out.printf("Yes! %.2f lv left.", Math.abs(travelPrice - sum));
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", Math.abs(travelPrice - sum));
        }


    }
}

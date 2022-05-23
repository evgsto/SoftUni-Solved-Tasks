package JavaBasics.ConditionalStatments.Exercises;

import java.util.Scanner;

public class LunchBreakREAL {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        int time = Integer.parseInt(scanner.nextLine());
        double lunchTime = Integer.parseInt(scanner.nextLine());

        double freeTime = lunchTime - (lunchTime / 8 + lunchTime / 4);
        if (freeTime >= time) {
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", name, Math.ceil(freeTime - time));
        } else {
    System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.",name,Math.ceil(time-freeTime));
        }
    }

}

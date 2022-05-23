package JavaBasics.ConditionalStatments.Extra;

import java.util.Scanner;

public class SleepyTomCat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int weekends = Integer.parseInt(scanner.nextLine());
        int workdays = 365 - weekends;
        int playTime = weekends * 127 + workdays * 63;
        //нормата за игра на Том е 30 000 минути в година
        int hours = Math.abs((playTime-30000) / 60);
        int min = Math.abs((playTime-30000) % 60);

        if (playTime > 30000) {
            System.out.println("Tom will run away");

            System.out.printf("%d hours and %d minutes more for play", hours, min);
        }else {
            System.out.println("Tom sleeps well");
            System.out.printf("%d hours and %d minutes less for play",hours,min);
        }


    }
}

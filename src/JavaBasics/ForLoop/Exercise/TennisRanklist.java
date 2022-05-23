package JavaBasics.ForLoop.Exercise;

import java.util.Scanner;

public class TennisRanklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tournirs = Integer.parseInt(scanner.nextLine());
        int startPoints = Integer.parseInt(scanner.nextLine());
        double zeroPoints = startPoints;
        double wins = 0;


        for (int i = 0; i < tournirs; i++) {
            String rank = scanner.nextLine();
            switch (rank) {
                case "W":
                    startPoints += 2000;
                    wins++;
                    break;
                case "F":
                    startPoints += 1200;
                    break;
                case "SF":
                    startPoints += 720;
                    break;
            }

        }
        System.out.printf("Final points: %d%n", startPoints);
        System.out.printf("Average points: %.0f%n", Math.floor((startPoints - zeroPoints) / tournirs));
        System.out.printf("%.2f%%", wins / tournirs * 100);
    }
}

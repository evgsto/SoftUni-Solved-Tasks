package JavaFundamentals.Revision.Exercise;

import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lostGames = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        double brokenHeadset = Math.floor(lostGames/2);
        double brokenMouse  = Math.floor(lostGames/3);
        double brokenKeyboard = Math.floor(lostGames/6);
        double brokenDisplay = Math.floor(lostGames/12);

        double total = brokenHeadset*headsetPrice + brokenMouse*mousePrice + brokenKeyboard*keyboardPrice + brokenDisplay*displayPrice;
        System.out.printf("Rage expenses: %.2f lv.",total);


    }


}

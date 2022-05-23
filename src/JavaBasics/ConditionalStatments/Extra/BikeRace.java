package JavaBasics.ConditionalStatments.Extra;

import java.util.Scanner;

public class BikeRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int juniors = Integer.parseInt(scanner.nextLine());
        int seniors = Integer.parseInt(scanner.nextLine());
        String  track = scanner.nextLine();

        double tax = 0;
        switch (track) {
            case "trail":
                tax = juniors*5.50 +seniors*7.00;
                break;
            case "cross-country":
                tax = juniors*8 +seniors*9.50;
                if (juniors+seniors >= 50){
                    tax= tax - (tax*0.25);
                }
                break;
            case "downhill":
                tax = juniors*12.25 + seniors*13.75;
                break;
            case "road":
                tax = juniors*20.00 + seniors*21.50;
                break;
        }
        tax = tax - (tax*0.05);
        System.out.printf("%.2f",tax );


    }
}

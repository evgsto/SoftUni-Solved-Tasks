package JavaBasics.ConditionalStatments.Extra;

import java.util.Scanner;

public class Harvest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int area = Integer.parseInt(scanner.nextLine());
        double grape = Double.parseDouble(scanner.nextLine());
        int litres = Integer.parseInt(scanner.nextLine());
        int workers = Integer.parseInt(scanner.nextLine());
        double product = area * grape;
        double wine = (product*0.40)/2.5;
        double wineRest = Math.abs(litres-wine);

        if (wine < litres) {
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.",Math.floor(wineRest));
        }else {
            System.out.printf("Good harvest this year! Total wine: %.0f liters.%n",Math.floor(wine));
            System.out.printf("%.0f liters left -> %.0f liters per person.",Math.ceil(wineRest),Math.ceil(wineRest/workers));
        }
    }
}

package JavaBasics.ContestSoftUni;

import java.util.Scanner;

public class FootballKit {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        double priceShirt = Double.parseDouble(scanner.nextLine());
        double finalSum = Double.parseDouble(scanner.nextLine());

        double priceShort = priceShirt*0.75;
        double priceSocks = priceShort*0.20;
        double priceShoe = (priceShirt+priceShort)*2;
        double totalSum =  priceShirt+priceShort+priceSocks+priceShoe;
        double disc = totalSum*0.15;
        totalSum = totalSum-disc;

        if (totalSum>=finalSum){
            System.out.printf("Yes, he will earn the world-cup replica ball!%n");
            System.out.printf("His sum is %.2f lv.",totalSum);
        }else  {
            System.out.println("No, he will not earn the world-cup replica ball.");
            System.out.printf("He needs %.2f lv. more.",finalSum-totalSum);
        }

    }
}

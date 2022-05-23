package JavaBasics.Contest2;

import java.util.Scanner;

public class Job1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int paint = Integer.parseInt(scanner.nextLine());
        int rows = Integer.parseInt(scanner.nextLine());
        double glovePrice = Double.parseDouble(scanner.nextLine());
        double brushPrice = Double.parseDouble(scanner.nextLine());


        double gloveCount = Math.ceil(0.35*rows);
        double brushCount = Math.floor(0.48*paint);
        double total = 0;
        double  deliveri = 0;

        total = 21.50*paint + 5.20*rows + gloveCount*glovePrice + brushCount*brushPrice;
        deliveri = total /15;
        System.out.printf("This delivery will cost %.2f lv.",deliveri);


    }
}

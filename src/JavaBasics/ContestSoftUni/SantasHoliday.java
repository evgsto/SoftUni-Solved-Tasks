package JavaBasics.ContestSoftUni;

import java.util.Scanner;

public class SantasHoliday {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        String place = scanner.nextLine();
        String judje = scanner.nextLine();

        double nightPrice  = 0;
        double discount = 0;
        double price = 0 ;
        double bonus = 0;
        switch (place) {
            case "room for one person":
                nightPrice = 18.00;
                discount=0;
                break;

            case "apartment":
                nightPrice = 25.00;
                if (days<10){
                    discount=0.30;
                }else if (days<=15){
                    discount=0.35;
                }else {
                    discount=0.50;
                }
                break;

            case "president apartment":
                nightPrice=35.00;
                if (days<10){
                    discount=0.10;
                }else if (days<=15){
                    discount=0.15;
                }else {
                    discount=0.20;
                }
                break;


        }
            price  = (days-1) * nightPrice;
            discount = price*discount;
            price = price-discount;

        switch (judje){
            case "positive" :
                bonus = price*0.25;
                price = price+bonus;
                break;
            case "negative" :
                bonus = price*0.10;
                price = price-bonus;
                break;

        }
        System.out.printf("%.2f",price);


    }
}

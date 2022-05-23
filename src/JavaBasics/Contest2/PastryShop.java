package JavaBasics.Contest2;

import java.util.Scanner;

public class PastryShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        int productCount = Integer.parseInt(scanner.nextLine());
        int day = Integer.parseInt(scanner.nextLine());
        double price = 0;


        switch (product) {
            case "Cake" :
                if (day<=15){
                    price = 24.00;
                }else {
                    price = 28.70;
                }
                break;

            case "Souffle" :
                if (day<=15){
                    price = 6.66;
                }else {
                    price = 9.80;
                }
                break;
            case "Baklava" :
                if (day<=15){
                    price = 12.60;
                }else {
                    price = 16.98;
                }
                break;
        }
        double totalPrice = price*productCount;
        double discount = 0 ;

        if (day<=22) {

            if (totalPrice > 200) {
                discount = totalPrice * 0.25;

            }else  if (totalPrice > 100) {
                discount = totalPrice * 0.15;
            }else {
                discount = 0;
            }

            totalPrice = totalPrice - discount;
            if (day <= 15) {
                discount = totalPrice*0.10;
            }
            System.out.printf("%.2f", totalPrice - discount);
        }else {
            System.out.printf("%.2f",totalPrice);
        }


    }
}

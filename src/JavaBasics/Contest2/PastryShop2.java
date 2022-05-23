package JavaBasics.Contest2;

import java.util.Scanner;

public class PastryShop2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        int productCount = Integer.parseInt(scanner.nextLine());
        int orderDay = Integer.parseInt(scanner.nextLine());
        double productPrice= 0;
        double totalPrice = 0;
        double discount = 0;

        if (orderDay<=15){
            switch(product){
                case "Cake" :
                    productPrice= 24.00;
                    break;
                case "Souffle" :
                    productPrice= 6.66;
                    break;
                case "Baklava" :
                    productPrice = 12.60;
                    break;

            }

        }else {
            switch(product){
                case "Cake" :
                    productPrice= 28.70;
                    break;
                case "Souffle" :
                    productPrice= 9.80;
                    break;
                case "Baklava" :
                    productPrice = 16.98;
                    break;

            }



        }
        totalPrice = productPrice*productCount;
        if (orderDay<=22){
            if (totalPrice>=100 && totalPrice<=200){
                discount = totalPrice*0.15;
            }else if (totalPrice>200){
                discount = totalPrice*0.25;
            }else {
                discount = 0;
            }
        totalPrice = totalPrice-discount;

            if (orderDay<=15){
                totalPrice=totalPrice - (totalPrice*0.10);
            }

        }
        System.out.printf("%.2f",totalPrice);



    }
}

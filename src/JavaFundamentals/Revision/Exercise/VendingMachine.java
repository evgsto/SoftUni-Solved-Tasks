package JavaFundamentals.Revision.Exercise;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        double coinSum = 0;
        double prductPrice = 0;
        String product = "";
        while (!input.equals("Start")) {
            double coin = Double.parseDouble(input);
            if (coin == 0.1) {
                coinSum += coin;
            } else if (coin == 0.2) {
                coinSum += coin;
            } else if (coin == 0.5) {
                coinSum += coin;
            } else if (coin == 1) {
                coinSum += coin;
            } else if (coin == 2) {
                coinSum += coin;
            } else {
                System.out.printf("Cannot accept %.2f%n",coin);

            }

            input = scanner.nextLine();
        }
        input = scanner.nextLine();
        while (!input.equals("End")) {

            switch (input) {
                case "Nuts":
                    prductPrice = 2.0;
                    product = "Nuts";
                    break;
                case "Water":
                    prductPrice = 0.7;
                    product = "Water";
                    break;
                case "Crisps":
                    prductPrice = 1.5;
                    product = "Crisps";
                    break;
                case "Soda":
                    prductPrice = 0.8;
                    product = "Soda";
                    break;
                case "Coke":
                    prductPrice= 1.0;
                    product = "Coke";
                    break;
                default:
                    System.out.println("Invalid product");
                    break;
            }
            if (coinSum<prductPrice){
                System.out.println("Sorry, not enough money");

            }else {
                coinSum = coinSum - prductPrice;
                if (!product.equals("")) {
                    System.out.printf("Purchased %s%n", product);

                }
            }

            input = scanner.nextLine();
        }
        System.out.printf("Change: %.2f",coinSum);

    }
}

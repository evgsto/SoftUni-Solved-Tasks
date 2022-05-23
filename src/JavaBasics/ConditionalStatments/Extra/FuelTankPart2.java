package JavaBasics.ConditionalStatments.Extra;

import java.util.Scanner;

public class FuelTankPart2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fuel = scanner.nextLine();
        double amount = Double.parseDouble(scanner.nextLine());
        String card = scanner.nextLine();
        double price = 0;

        switch (fuel) {
            case "Gas":
              price = 0.93;
              if (card.equals("Yes")){
                  price -= 0.08;
              }
              break;
            case "Gasoline":
                price = 2.22;
                if (card.equals("Yes")){
                    price -= 0.18;
                }
                break;
            case "Diesel":
                price = 2.33;
                if (card.equals("Yes")){
                    price -= 0.12;
                }
                break;
        }

        double sum = amount*price;

        double discount =0 ;
            if (amount>=20 && amount<=25){
                discount = sum*0.08;
            }else if (amount>25){
                discount = sum*0.1;
            }
          sum -= discount;

        System.out.printf("%.2f lv.",sum);


    }
}

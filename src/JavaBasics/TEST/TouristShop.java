package JavaBasics.TEST;

import java.util.Scanner;

public class TouristShop {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);


        double budget = Double.parseDouble(scanner.nextLine());
        int counter = 0 ;
        double totalSum = 0;
        boolean flag = true ;


        String name = scanner.nextLine();
        while (!name.equals("Stop")){
            double price = Double.parseDouble(scanner.nextLine());

            counter++;
            if (counter % 3==0 ){
                price = price/2;
            }


            if (budget>=price){
                totalSum+=price;
                budget-=price;
            }
            else {
                System.out.println("You don't have enough money!");
                System.out.printf("You need %.2f leva!",price-budget);
                flag = false ;
                break;
            }





            name = scanner.nextLine();
        }
        if(flag) {
            System.out.printf("You bought %d products for %.2f leva.", counter, totalSum);
        }





    }
}

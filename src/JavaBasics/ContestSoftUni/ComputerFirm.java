package JavaBasics.ContestSoftUni;

import java.util.Scanner;

public class ComputerFirm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());
        double sales = 0;
        double totalSales = 0;
        double  rating = 0;

        for (int i = 0; i < count; i++) {
            int input = Integer.parseInt(scanner.nextLine());
            if (input%10==2){
                sales = 0;
               rating+= input%10;
            }else if (input%10==3){
                sales = 0.50;
                rating+= input%10;
            }else if (input%10==4){
                sales = 0.70;
                rating+= input%10;
            }else if (input%10==5){
                sales = 0.85;
                rating+= input%10;
            }else if (input%10==6){
                sales = 1.00;
                rating+= input%10;
            }
            int counts = input/10;
            totalSales+=counts*sales;




        }
        System.out.printf("%.2f%n",totalSales*1.00);
        System.out.printf("%.2f",rating/count);

    }
}

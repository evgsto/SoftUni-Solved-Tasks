package JavaBasics.Contest2;

import java.util.Scanner;

public class GoldMine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int locationCount = Integer.parseInt(scanner.nextLine());


        double totalIncome = 0;
        double  avarage = 0;


        for (int i = 0; i < locationCount; i++) {

            double goldIncome = Double.parseDouble(scanner.nextLine());
            int digDays = Integer.parseInt(scanner.nextLine());

            for (int j = 0; j < digDays; j++) {

                    double dayIncome = Double.parseDouble(scanner.nextLine());
                    totalIncome+=dayIncome;

            }
             avarage = totalIncome/digDays;

            if (avarage>=goldIncome){
                System.out.printf("Good job! Average gold per day: %.2f.%n",avarage);

            }else {
                System.out.printf("You need %.2f gold.%n",goldIncome-avarage);

            }
            totalIncome = 0 ;
            avarage =0;



        }


    }
}

package JavaBasics.WhileLoop.Exercise;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner sccaner =  new Scanner(System.in);

        double needMoney = Double.parseDouble(sccaner.nextLine());
        double ownMoney = Double.parseDouble(sccaner.nextLine());
        int   spendCounter = 0;
        int days = 0;


        while  (needMoney>ownMoney){
            String action = sccaner.nextLine();
            double inputSum = Double.parseDouble(sccaner.nextLine());
            days++;
            if(action.equals("spend")){
                ownMoney-=inputSum;
                spendCounter++;
                if (ownMoney<0){
                    ownMoney = 0 ;
                }
            }
            if(action.equals("save")){
                ownMoney+=inputSum;
                spendCounter=0;
            }
            if (spendCounter == 5 ){
                System.out.println("You can't save the money.");
                System.out.println(days);
                break;
            }

        }
        if (ownMoney >= needMoney){
            System.out.printf("You saved the money for %d days.",days);
        }
    }
}

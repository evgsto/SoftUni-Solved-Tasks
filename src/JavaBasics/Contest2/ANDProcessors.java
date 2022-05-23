package JavaBasics.Contest2;

import java.util.Scanner;

public class ANDProcessors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int processorsCount = Integer.parseInt(scanner.nextLine());
        int workersCount = Integer.parseInt(scanner.nextLine());
        int workingDays = Integer.parseInt(scanner.nextLine());

        double hours = 0;
        hours = 8 * workersCount * workingDays;
        double cpuUnits = Math.floor(hours/3);


        if (cpuUnits>=processorsCount){
            System.out.printf("Profit: -> %.2f BGN",(cpuUnits-processorsCount)*110.10);
        }else {
            System.out.printf("Losses: -> %.2f BGN",(processorsCount-cpuUnits)*110.10);
        }



    }
}

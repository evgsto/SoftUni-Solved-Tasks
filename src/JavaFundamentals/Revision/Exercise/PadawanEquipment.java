package JavaFundamentals.Revision.Exercise;

import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int numStudents = Integer.parseInt(scanner.nextLine());
        double priceSaber= Double.parseDouble(scanner.nextLine());
        double priceRobes= Double.parseDouble(scanner.nextLine());
        double priceBelts= Double.parseDouble(scanner.nextLine());

        double  saberNeeded =Math.ceil(numStudents + (numStudents*0.1));
        double  beltNeeded = Math.floor(numStudents/6);

        double total = (numStudents*priceRobes)+(saberNeeded*priceSaber)+(priceBelts*(numStudents-beltNeeded));

        if (budget>=total){
            System.out.printf("The money is enough - it would cost %.2flv.",total);
        }else {
            System.out.printf("George Lucas will need %.2flv more.",total-budget);
        }

    }
}

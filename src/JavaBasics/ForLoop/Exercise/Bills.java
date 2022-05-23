package JavaBasics.ForLoop.Exercise;

import java.util.Scanner;

public class Bills {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int months = Integer.parseInt(scanner.nextLine());
        double electricitySum = 0 ;
        double water = 0;
        double internet = 0 ;
        double others = 0;



        for (int i = 0; i < months; i++) {
            double electricity = Double.parseDouble(scanner.nextLine());
                electricitySum += electricity;
                water+=20;
                internet+=15;
                double currentOthers = ((20 +15 + electricity)*0.20)+(20 +15 + electricity);
                others+=currentOthers;

        }
        double total = electricitySum+water+internet+others;

        System.out.printf("Electricity: %.2f lv%n",electricitySum);
        System.out.printf("Water: %.2f lv%n",water);
        System.out.printf("Internet: %.2f lv%n",internet);
        System.out.printf("Other: %.2f lv%n",others);
        System.out.printf("Average: %.2f lv",total/months);

    }
}

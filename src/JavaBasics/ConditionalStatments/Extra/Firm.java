package JavaBasics.ConditionalStatments.Extra;

import java.util.Scanner;

public class Firm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int reqHours = Integer.parseInt(scanner.nextLine());
        double workDays = Integer.parseInt(scanner.nextLine());
        int workers =  Integer.parseInt(scanner.nextLine());


        double overtime =  workers*2*workDays ;
        workDays = workDays - (workDays*0.10);
        double workHours =  overtime + (workDays*8);
        workHours = Math.floor(workHours);

        if (workHours >= reqHours){
            System.out.printf("Yes!%.0f hours left.",workHours-reqHours);
        }else {
            System.out.printf("Not enough time!%.0f hours needed.",reqHours-workHours);
        }
    }
}

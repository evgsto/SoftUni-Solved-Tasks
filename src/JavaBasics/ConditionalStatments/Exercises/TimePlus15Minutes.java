package JavaBasics.ConditionalStatments.Exercises;

import java.util.Scanner;

public class TimePlus15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = Integer.parseInt(scanner.nextLine());
        int min = Integer.parseInt(scanner.nextLine());
        int total = (hour*60)+min+15;
        int newHour = total/60;
        int newMin = total%60 ;

        if (newHour > 23){
            newHour = 0;
        }

        if (newMin< 10){
            System.out.printf("%d:0%d",newHour,newMin);
        }else {
            System.out.printf("%d:%d", newHour,newMin);
        }


    }
}

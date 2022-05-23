package JavaBasics.ConditionalStatments.Extra;

import java.util.Scanner;

public class WorkingHours {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = Integer.parseInt(scanner.nextLine());
        String day = scanner.nextLine();
    //Monday
    //Tuesday
    //Wednesday
    //Thursday
    //Friday
    //Saturday
    //Sunday
        switch (day) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
            case "Saturday":
                if (hour>=10 && hour <=18) {
                    System.out.println("open");
                }else if (hour  > 0 && hour < 10) {
                    System.out.println("closed");
            }else if (hour > 18 && hour < 24){
                    System.out.println("closed");
                }

                break;
            case "Sunday" :
                System.out.println("closed");
                break;
        }


    }
}

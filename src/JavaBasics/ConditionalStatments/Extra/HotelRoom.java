package JavaBasics.ConditionalStatments.Extra;

import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String month = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());
        double studio = 0;
        double apart = 0;


        switch (month) {
            case "May":
            case "October":
                studio = 50.00;
                if (nights > 7.00 && nights <= 14) {
                    studio = studio - (studio * 0.05);
                } else if (nights > 14) {
                    studio = studio - (studio * 0.30);
                }
                apart = 65.00;
                if (nights > 14) {
                    apart = apart - (apart * 0.10);
                }
                break;
            case "June":
            case "September":
                studio = 75.20;
                if (nights > 14) {
                    studio = studio - (studio * 0.20);
                }
                apart = 68.70;
                if (nights > 14) {
                    apart = apart - (apart * 0.10);
                }
                break;
            case "July":
            case "August":
                studio = 76.00;
                apart = 77.00;
                if (nights > 14) {
                    apart = apart - (apart * 0.10);
                }
                break;
        }

                System.out.printf("Apartment: %.2f lv.%n",nights*apart);
                System.out.printf("Studio: %.2f lv.",nights*studio);


    }

}

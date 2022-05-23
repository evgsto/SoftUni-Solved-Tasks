package JavaBasics.ConditionalStatments.Extra;

import java.util.Scanner;

public class SchoolCamp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String season = scanner.nextLine();
        String group = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());
        int nights = Integer.parseInt(scanner.nextLine());
        String sport ="" ;
        double nightPrice = 0;


        double discount = 0;
        if (count >= 50) {
            discount = 0.50;
        } else if (count >= 20) {
            discount = 0.15;
        } else if (count >= 10) {
            discount = 0.05;
        }
        switch (season) {
            case "Winter":
                switch (group){
                    case "boys":
                        sport = "Judo";
                        nightPrice = 9.60;
                        break;
                    case "girls":
                        sport = "Gymnastics";
                        nightPrice = 9.60;
                        break;
                    case "mixed":
                        sport = "Ski";
                        nightPrice = 10.00;
                        break;
                }
                break;

            case "Spring":
                switch (group){
                    case "boys":
                        sport = "Tennis";
                        nightPrice = 7.20;
                        break;
                    case "girls":
                        sport = "Athletics";
                        nightPrice = 7.20;
                        break;
                    case "mixed":
                        sport = "Cycling";
                        nightPrice = 9.50;
                        break;
                }
                break;
            case "Summer":
                switch (group){
                    case "boys":
                        sport = "Football";
                        nightPrice =15.00;
                        break;
                    case "girls":
                        sport = "Volleyball";
                        nightPrice = 15.00;
                        break;
                    case "mixed":
                        sport = "Swimming";
                        nightPrice = 20.00;
                        break;
                }
                break;
        }
        double sum = nights*nightPrice*count;
        sum = sum - (sum*discount);
        System.out.printf("%s %.2f lv.",sport,sum);

    }
}

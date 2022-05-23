package JavaBasics.FirsStepsInCoding.Lab;

import java.util.Scanner;

public class WeatherForecast2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double Degr = Double.parseDouble(scanner.nextLine());
        //


        if (Degr >= 26.00 && Degr <= 35.00) {
            System.out.println("Hot");
        } else if (Degr >= 20.1 && Degr <= 25.9) {
            System.out.println("Warm");
        } else if (Degr >= 15.00 && Degr <= 20.00) {
            System.out.println("Mild");
        } else if (Degr >= 12.00 && Degr <= 14.90) {
            System.out.println("Cool");
        } else if (Degr >= 5.00 && Degr <= 11.9) {
            System.out.println("Cold");
        } else {
            System.out.println("unknown");
        }
    }

}



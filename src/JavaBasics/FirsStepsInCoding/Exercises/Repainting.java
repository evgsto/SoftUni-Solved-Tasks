package JavaBasics.FirsStepsInCoding.Exercises;

import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nylon = Integer.parseInt(scanner.nextLine());
        int paint = Integer.parseInt(scanner.nextLine());
        int tiner = Integer.parseInt(scanner.nextLine());
        int WorkHours = Integer.parseInt(scanner.nextLine());

        //•	Предпазен найлон - 1.50 лв. за кв. метър
        //•	Боя - 14.50 лв. за литър
        //•	Разредител за боя - 5.00 лв. за литър

        double priceNylon = (nylon +2)* 1.50 ;
        double pricePaint = (paint+(paint*(10/100.00)))*14.50;
        double sumMaterial = priceNylon + pricePaint + tiner*5.00 + 0.40;
        double sumHours = WorkHours*(sumMaterial*(30/100.00));
        System.out.println(sumHours+sumMaterial);
    }
}

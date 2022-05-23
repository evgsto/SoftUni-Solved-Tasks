package JavaBasics.FirsStepsInCoding.Exercises;

import java.util.Scanner;

public class SuppliesForSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pens = Integer.parseInt(scanner.nextLine());
        int markers = Integer.parseInt(scanner.nextLine());
        int windex = Integer.parseInt(scanner.nextLine());
        int disc = Integer.parseInt(scanner.nextLine());

        //•	Пакет химикали - 5.80 лв.
        //•	Пакет маркери - 7.20 лв.
        //•	Препарат - 1.20 лв (за литър)


        double total = (pens * 5.80) + (markers * 7.20) + (windex * 1.20);
        double discount = total*(disc/100.00);
        System.out.println(total-discount);

    }
}

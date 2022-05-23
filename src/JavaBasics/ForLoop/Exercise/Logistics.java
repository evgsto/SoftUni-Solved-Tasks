package JavaBasics.ForLoop.Exercise;


import java.util.Scanner;

public class Logistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cargo = Integer.parseInt(scanner.nextLine());

        double bus = 0;
        double tir = 0;
        double train = 0;

        int sum = 0;


        for (int i = 0; i < cargo; i++) {
            int tons = Integer.parseInt(scanner.nextLine());

            if (tons <= 3) {
                bus += tons;
                sum += tons;
            } else if (tons <= 11) {
                tir += tons;
                sum += tons;
            } else {
                train += tons;
                sum += tons;
            }

        }
        double busPrice = bus * 200;
        double tirPrice = tir * 175;
        double trainPrice = train * 120;

        double avaragePrice = (busPrice + tirPrice + trainPrice) / sum;
        System.out.printf("%.2f%n", avaragePrice);
        System.out.printf("%.2f%%%n", bus / sum * 100);
        System.out.printf("%.2f%%%n", tir / sum * 100);
        System.out.printf("%.2f%%%n", train / sum * 100);
    }
}

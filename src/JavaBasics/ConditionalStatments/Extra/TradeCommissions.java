package JavaBasics.ConditionalStatments.Extra;

import java.util.Scanner;

public class TradeCommissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String town = scanner.nextLine();
        double sels = Double.parseDouble(scanner.nextLine());
        double commision = 0;

        switch (town) {
            case "Sofia":
                if (sels >= 0 && sels <= 500) {
                    commision = 0.05;
                } else if (sels > 500 && sels <= 1000) {
                    commision = 0.07;
                } else if (sels > 1000 && sels <= 10000) {
                    commision = 0.08;
                } else if (sels > 10000) {
                    commision = 0.12;
                }
                break;
            case "Varna":
                if (sels >= 0 && sels <= 500) {
                    commision = 0.045;
                } else if (sels > 500 && sels <= 1000) {
                    commision = 0.075;
                } else if (sels > 1000 && sels <= 10000) {
                    commision = 0.10;
                } else if (sels > 10000) {
                    commision = 0.13;
                }
                break;
            case "Plovdiv":
                if (sels >= 0 && sels <= 500) {
                    commision = 0.055;
                } else if (sels > 500 && sels <= 1000) {
                    commision = 0.08;
                } else if (sels > 1000 && sels <= 10000) {
                    commision = 0.12;
                } else if (sels > 10000) {
                    commision = 0.145;
                }
                break;

        }
        if (commision * sels > 0) {
            System.out.printf("%.2f", commision * sels);
        }else {
            System.out.println("error");
        }



    }
}

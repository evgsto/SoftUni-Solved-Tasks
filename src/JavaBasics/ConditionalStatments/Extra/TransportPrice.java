package JavaBasics.ConditionalStatments.Extra;

import java.util.Scanner;

public class TransportPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int km = Integer.parseInt(scanner.nextLine());
        String time = scanner.nextLine();
        double priceTaxi = 0;
        double priceBus = 0;
        double priceTrain = 0;

        //Такси. Начална такса: 0.70 лв. Дневна тарифа: 0.79 лв./км. Нощна тарифа: 0.90 лв./км.
        //• Автобус. Дневна / нощна тарифа: 0.09 лв./км. Може да се използва за разсто-яния минимум 20 км.
        //• Влак. Дневна / нощна тарифа: 0.06 лв./км. Може да се използва за разсто-яния минимум 100 км.

        switch (time) {
            case "day":
                priceTaxi = 0.70 + 0.79 * km;
                priceBus = 0.09 * km;
                priceTrain = 0.06 * km;
                break;
            case "night":
                priceTaxi = 0.70 + 0.90 * km;
                priceBus = 0.09 * km;
                priceTrain = 0.06 * km;
                break;
        }
        if (km >= 20 && km < 100) {
            System.out.printf("%.2f",priceBus);
        } else if (km >= 100) {
            System.out.printf("%.2f",priceTrain);
        } else {
            System.out.printf("%.2f",priceTaxi);
        }
    }

}

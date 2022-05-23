package JavaBasics.ConditionalStatments.Exercises;

import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner scaneer = new Scanner(System.in);
        //	"room for one person" – 18.00 лв за нощувка
        //	"apartment" – 25.00 лв за нощувка
        //	"president apartment" – 35.00 лв за нощувка
        // пример: 11 дни = 10 нощувки

        int restindDays = Integer.parseInt(scaneer.nextLine());
        String roomType = scaneer.nextLine();
        String rating = scaneer.nextLine();
        double roomPrice = 0;
        double finalprice = 0;
        double disc = 0;

        if (roomType.equals("room for one person")) {
            roomPrice = 18.00;
        } else if (roomType.equals("apartment")) {
            roomPrice = 25.00;
        } else if (roomType.equals("president apartment")) {
            roomPrice = 35.00;
        }
        if (restindDays < 10) {
            switch (roomType) {
                case "room for one person":
                    disc = 0;
                    break;
                case "apartment":
                    disc = 0.30;
                    break;
                case "president apartment":
                    disc = 0.10;
                    break;
            }
        } else if (restindDays > 10 && restindDays <= 15) {
            switch (roomType) {
                case "room for one person":
                    disc = 0;
                    break;
                case "apartment":
                    disc = 0.35;
                    break;
                case "president apartment":
                    disc = 0.15;
                    break;
            }
        } else {
            switch (roomType) {
                case "room for one person":
                    disc = 0;
                    break;
                case "apartment":
                    disc = 0.50;
                    break;
                case "president apartment":
                    disc = 0.20;
                    break;
            }
        }
        finalprice = (restindDays - 1) * roomPrice;
        finalprice = finalprice - (finalprice * disc);
        if (rating.equals("positive")){
            finalprice = finalprice + (finalprice*0.25);
                    }else if (rating.equals("negative")){
            finalprice = finalprice - (finalprice*0.10);
        }
        System.out.printf("%.2f",finalprice);

    }
}

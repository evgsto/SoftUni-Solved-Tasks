package JavaBasics.ConditionalStatments.Extra;

import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fruit = scanner.nextLine();
        String day = scanner.nextLine();
        String workDay = "unknow";
        double count = Double.parseDouble(scanner.nextLine());
        double price = 0;
        //плод	banana	apple	orange	grapefruit	kiwi	pineapple	grapes
        //цена	2.50	1.20	0.85	1.45     	2.70	5.50    	3.85


        //Събота и неделя магазинът работи на по-високи цени:
        //плод	banana	apple	orange	grapefruit	kiwi	pineapple	grapes
        //цена	2.70	1.25	0.90	1.60    	3.00	5.60    	4.20
        switch (day) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                workDay = "workDay";
                break;
            case "Saturday":
            case "Sunday":
                workDay = "weekEnd";
                break;

        }


        switch (fruit) {
            case "banana":
                if (workDay.equals("workDay")) {
                    price = 2.50;
                } else if (workDay.equals("weekEnd")) {
                    price = 2.70;
                }
                break;
            case "apple":
                if (workDay.equals("workDay")) {
                    price = 1.20;
                } else if (workDay.equals("weekEnd")) {
                    price = 1.25;
                }
                break;
            case "orange":
                if (workDay.equals("workDay")) {
                    price = 0.85;
                } else if (workDay.equals("weekEnd")) {
                    price = 0.90;
                }
                break;
            case "grapefruit":
                if (workDay.equals("workDay")) {
                    price = 1.45;
                } else if (workDay.equals("weekEnd")) {
                    price = 1.60;
                }
                break;
            case "kiwi":
                if (workDay.equals("workDay")) {
                    price = 2.70;
                } else if (workDay.equals("weekEnd")) {
                    price = 3.00;
                }
                break;
            case "pineapple":
                if (workDay.equals("workDay")) {
                    price = 5.50;
                } else if (workDay.equals("weekEnd")) {
                    price = 5.60;
                }
                break;
            case "grapes":
                if (workDay.equals("workDay")) {
                    price = 3.85;
                } else if (workDay.equals("weekEnd")) {
                    price = 4.20;
                }
                break;

        }
        if ((count * price) == 0) {
            System.out.println("error");
        } else {
            System.out.printf("%.2f",count * price);
        }

    }
}

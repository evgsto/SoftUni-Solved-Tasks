package JavaBasics.ConditionalStatments.Extra;

import java.util.Scanner;

public class SmallShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        String town = scanner.nextLine();
        double count = Double.parseDouble(scanner.nextLine());


        //  град / продукт	coffee	water	beer	sweets	peanuts
        //  Sofia       	0.50	0.80	1.20	1.45	1.60
        // Plovdiv	        0.40	0.70	1.15	1.30	1.50
        // Varna	        0.45   	0.70	1.10	1.35	1.55


        switch (town) {
            case "Sofia":
                switch (product) {
                    case "coffee":
                        System.out.println(count * 0.50);
                        break;
                    case "water":
                        System.out.println(count * 0.80);
                        break;
                    case "beer":
                        System.out.println(count * 1.20);
                        break;
                    case "sweets":
                        System.out.println(count * 1.45);
                        break;
                    case "peanuts":
                        System.out.println(count * 1.60);
                        break;
                }
                break;
            case "Plovdiv":
                switch (product) {
                    case "coffee":
                        System.out.println(count * 0.40);
                        break;
                    case "water":
                        System.out.println(count * 0.70);
                        break;
                    case "beer":
                        System.out.println(count * 1.15);
                        break;
                    case "sweets":
                        System.out.println(count * 1.30);
                        break;
                    case "peanuts":
                        System.out.println(count * 1.50);
                        break;
                }
                break;
            case "Varna":
                switch (product) {
                    case "coffee":
                        System.out.println(count * 0.45);
                        break;
                    case "water":
                        System.out.println(count * 0.70);
                        break;
                    case "beer":
                        System.out.println(count * 1.10);
                        break;
                    case "sweets":
                        System.out.println(count * 1.35);
                        break;
                    case "peanuts":
                        System.out.println(count * 1.55);
                        break;
                }
                break;
        }
    }
}

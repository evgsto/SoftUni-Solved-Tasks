package JavaBasics.ConditionalStatments.Extra;

import java.util.Scanner;

public class Pets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int foodKG = Integer.parseInt(scanner.nextLine());
        double dogFood = Double.parseDouble(scanner.nextLine());
        double catFood = Double.parseDouble(scanner.nextLine());
        double turtleFood = Double.parseDouble(scanner.nextLine());

        double consumedFood = (dogFood + catFood + (turtleFood/1000)) * days;

        if (foodKG >= consumedFood) {
            System.out.printf("%.0f kilos of food left.", Math.floor(foodKG - consumedFood));
        } else {
            System.out.printf("%.0f more kilos of food are needed.",Math.ceil(consumedFood-foodKG));
        }


    }
}

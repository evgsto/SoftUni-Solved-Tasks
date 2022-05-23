package JavaBasics.ConditionalStatments.Extra;


import java.util.Scanner;

public class FuelTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fuel = scanner.nextLine();
        double amount = Double.parseDouble(scanner.nextLine());

        switch (fuel) {
            case "Diesel":
            case "Gasoline":
            case "Gas":
                fuel = fuel.toLowerCase();
                if (amount >= 25) {
                    System.out.printf("You have enough %s.", fuel);
                } else {
                    System.out.printf("Fill your tank with %s!", fuel);
                }
                break;
            default:
                System.out.println("Invalid fuel!");
                break;

        }
    }
}

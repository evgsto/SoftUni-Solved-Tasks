package JavaBasics.FirsStepsInCoding.Lab;

import java.util.Scanner;

public class Vegetables {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double VegPrice = Double.parseDouble(scanner.nextLine());
        double FruitPrice = Double.parseDouble(scanner.nextLine());
        int VegSells = Integer.parseInt(scanner.nextLine());
        int FruitSells = Integer.parseInt(scanner.nextLine());
        double Sells = (VegPrice*VegSells) + (FruitPrice*FruitSells);
        double Prof = Sells/1.94;
        System.out.printf("%.2f",Prof);


    }
}

package JavaBasics.ContestSoftUni;

import java.util.Scanner;

public class ChristmasPreparation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int rowsPaper = Integer.parseInt(scanner.nextLine());
        int rowsMat = Integer.parseInt(scanner.nextLine());
        double littreGlue = Double.parseDouble(scanner.nextLine());
        double discount = Double.parseDouble(scanner.nextLine());
        discount = discount/100.00;
        double pricePaper = rowsPaper*5.80;
        double priceMat = rowsMat*7.20;
        double priceGlue = littreGlue*1.20;

        double sum = pricePaper+priceMat+priceGlue;
        discount = sum*discount;
        System.out.printf("%.3f",sum-discount);





    }
}

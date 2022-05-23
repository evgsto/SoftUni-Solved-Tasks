package JavaBasics.FirsStepsInCoding.Exercises;

import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double deposit = Double.parseDouble(scanner.nextLine());
        int time = Integer.parseInt(scanner.nextLine());
        double profit = Double.parseDouble(scanner.nextLine());
        double result = deposit + (time*(deposit*(profit/100))/12);
        System.out.println(result);
     }
}

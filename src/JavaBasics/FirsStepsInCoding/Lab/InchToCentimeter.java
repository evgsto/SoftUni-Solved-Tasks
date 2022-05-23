package JavaBasics.FirsStepsInCoding.Lab;

import java.util.Scanner;

public class InchToCentimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = Double.parseDouble(scanner.nextLine());
        double result = a*2.54;
        System.out.println(result);
    }
}

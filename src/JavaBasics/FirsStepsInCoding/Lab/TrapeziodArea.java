package JavaBasics.FirsStepsInCoding.Lab;

import java.util.Scanner;

public class TrapeziodArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double basisA = Double.parseDouble(scanner.nextLine());
        double basisB = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());
        double area = (basisA + basisB) * height / 2;
        System.out.printf("%.2f",area);
    }
}

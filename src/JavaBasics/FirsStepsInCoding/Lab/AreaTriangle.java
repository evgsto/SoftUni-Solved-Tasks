package JavaBasics.FirsStepsInCoding.Lab;

import java.util.Scanner;

public class AreaTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double basis = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());
        double area = (basis*height)/2;
        System.out.printf("%.2f" , area);


    }
}

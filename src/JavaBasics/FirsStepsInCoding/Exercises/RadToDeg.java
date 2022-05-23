package JavaBasics.FirsStepsInCoding.Exercises;

import java.util.Scanner;

public class RadToDeg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double Rad = Double.parseDouble(scanner.nextLine());
        double Deg = (Rad *  180 )/ Math.PI;
        System.out.println(Deg);
    }
}

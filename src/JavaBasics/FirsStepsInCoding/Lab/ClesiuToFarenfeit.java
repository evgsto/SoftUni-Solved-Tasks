package JavaBasics.FirsStepsInCoding.Lab;

import java.util.Scanner;

public class ClesiuToFarenfeit {
    public static void main(String[] args) {
                Scanner scanner= new Scanner(System.in);
                double cel = Double.parseDouble(scanner.nextLine());
                double far = cel*1.8+32;
                System.out.printf("%.2f",far);
    }
}

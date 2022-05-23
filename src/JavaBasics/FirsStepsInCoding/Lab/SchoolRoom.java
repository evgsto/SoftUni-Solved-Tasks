package JavaBasics.FirsStepsInCoding.Lab;

import java.util.Scanner;

public class SchoolRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double lenght = Double.parseDouble(scanner.nextLine());
        double wide = Double.parseDouble(scanner.nextLine());
        double row = (wide -1)/ 0.70;
        double colum = lenght  / 1.2;
        int Conv1 = (int) row;
        int Conv2 = (int) colum;
        int places = Conv1 * Conv2 - 3;
        System.out.printf("%d", places);


    }
}

package JavaBasics.FirsStepsInCoding.Lab;

import java.util.Scanner;

public class HousePainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double HeigthHouse = Double.parseDouble (scanner.nextLine());
        double lenghHouse = Double.parseDouble(scanner.nextLine());
        double heightRoof = Double.parseDouble(scanner.nextLine());
        // Green paint 1 m2 = 3.4m2 - WALLS
        // red paint = 1m2 = 4.3m2 - ROOF
        // door 1.2 * 2.00  ,  windows 2 * (1.5 * 1.5)
        double walls = (2*(HeigthHouse*HeigthHouse) - (1.20 * 2.00)) + (2*(HeigthHouse*lenghHouse)-2*(1.50*1.50));
        double roof  = HeigthHouse*heightRoof + 2*(HeigthHouse*lenghHouse);
        System.out.printf("%.2f %n", walls/3.4);
        System.out.printf("%.2f", roof/4.3);
     }
}

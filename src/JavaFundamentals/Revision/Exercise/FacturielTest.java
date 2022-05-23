package JavaFundamentals.Revision.Exercise;

import java.util.Scanner;

public class FacturielTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());
        int facturiel = 1;
        for (int i = 1; i <=input ; i++) {
            facturiel*=i;
        }
        System.out.printf("Фактурила на %d e %d",input,facturiel);
    }
}

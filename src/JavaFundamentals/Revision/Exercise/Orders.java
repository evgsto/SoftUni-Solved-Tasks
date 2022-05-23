package JavaFundamentals.Revision.Exercise;

import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int orderNum = Integer.parseInt(scanner.nextLine());
double total  = 0 ;
double totalSum = 0;


        for (int i = 0; i < orderNum ; i++) {
            double capsulePrice = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            int capsuleCount = Integer.parseInt(scanner.nextLine());
            total = days*capsuleCount*capsulePrice;
            System.out.printf("The price for the coffee is: $%.2f%n",total);
            totalSum+=total;
            total = 0;

        }
        System.out.printf("Total: $%.2f",totalSum);
    }
}

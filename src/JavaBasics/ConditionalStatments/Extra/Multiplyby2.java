package JavaBasics.ConditionalStatments.Extra;

import java.util.Scanner;

public class Multiplyby2 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        double num = Double.parseDouble(scanner.nextLine());

        while (true) {


            if (num<0){
                System.out.println("Negative number!");
                break;
            }
            System.out.printf("Result: %.2f%n", num * 2);
            num = Double.parseDouble(scanner.nextLine());
        }
    }
}

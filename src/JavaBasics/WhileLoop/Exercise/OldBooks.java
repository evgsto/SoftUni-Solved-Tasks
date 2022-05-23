package JavaBasics.WhileLoop.Exercise;

import java.util.Scanner;

public class OldBooks {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String favBook = scanner.nextLine();

        int counter = 0;
        boolean success = true;

        String input = scanner.nextLine();
        while (!input.equals(favBook)) {

            if (input.equals("No More Books")) {
                success = false;
                System.out.println("The book you search is not here!");
                System.out.printf("You checked %d books.", counter);
                break;
            }

            counter++;
            input = scanner.nextLine();
        }
        if (success) {
            System.out.printf("You checked %d books and found it.", counter);
        }
    }
}

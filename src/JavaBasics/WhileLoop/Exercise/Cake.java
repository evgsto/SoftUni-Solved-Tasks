package JavaBasics.WhileLoop.Exercise;

import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int avaliblePeaces = length * width;
        int sumPieces = 0;

        while (avaliblePeaces >= sumPieces) {
            String input = scanner.nextLine();
            if (input.equals("STOP")) {
                break;
            }
            int pieces = Integer.parseInt(input);
            sumPieces += pieces;


        }
        if (sumPieces > avaliblePeaces) {
            System.out.printf("No more cake left! You need %d pieces more.", Math.abs(sumPieces - avaliblePeaces));
        } else {
            System.out.printf("%d pieces are left.", Math.abs(sumPieces - avaliblePeaces));
        }
    }


}

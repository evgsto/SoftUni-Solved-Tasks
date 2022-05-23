package JavaBasics.NestedLoops.LAB;

import java.util.Scanner;

public class Building {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int floor = Integer.parseInt(scanner.nextLine());
        int rooms = Integer.parseInt(scanner.nextLine());


        for (int i = floor; i >= 1; i--) {
            System.out.println();
            for (int j = 0; j < rooms; j++) {
                if (i == floor) {
                    System.out.printf("L%d%d ", i, j);
                    continue;
                }

                if (i % 2 != 0) {
                    System.out.printf("A%d%d ", i, j);
                    continue;

                }
                if (i%2 == 0 ) {
                    System.out.printf("O%d%d ",i,j);
                    continue;
                }
            }

        }


    }
}

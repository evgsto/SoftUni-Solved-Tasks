package JavaBasics.NestedLoops.Exercise;

import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int num = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                for (int k = 1; k <= 9; k++) {
                    for (int l = 1; l <= 9; l++) {
                        boolean specialNum = num % i == 0 && num % j == 0 && num % k == 0 && num % l == 0;
                        if (specialNum) {
                            System.out.printf("%d%d%d%d", i, j, k, l);
                            System.out.print(" ");
                        }
                    }

                }
            }

        }

    }
}

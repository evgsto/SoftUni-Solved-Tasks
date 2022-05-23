package JavaBasics.ForLoop.Exercise;

import java.util.Scanner;

public class EqualPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pairs = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int diff = 0;
        int firstsum = 0;

        for (int i = 0; i < pairs; i++) {
            int num1 = Integer.parseInt(scanner.nextLine());
            int num2 = Integer.parseInt(scanner.nextLine());
            sum = num1 + num2;

            if (i == 0) {
                firstsum = sum;
            }

            if (sum != firstsum) {
                diff = Math.abs(sum - firstsum);
                firstsum = sum;
            }

        }
        if (diff == 0) {
            System.out.printf("Yes, value=%d", sum);
        } else {
            System.out.printf("No, maxdiff=%d", diff);
        }
    }
}
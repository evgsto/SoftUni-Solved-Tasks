package JavaBasics.ForLoop.Exercise;

import java.util.Scanner;

public class HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int biggest = 0;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            sum += num;
            if (num >= biggest) {
                biggest = num;
            }

        }
        if ((sum-biggest) ==  biggest) {
            System.out.println("Yes");
            System.out.printf("Sum = %d", biggest);
        } else {
            System.out.println("No");
            System.out.printf("Diff = %d", Math.abs(biggest-(sum-biggest)));
        }
    }
}

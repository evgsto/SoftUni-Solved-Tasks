package JavaBasics.WhileLoop.Exercise;

import java.util.Scanner;

public class Walking {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sumSteps = 0;


        while (sumSteps < 10000) {
            String input = (scanner.nextLine());
            if (input.equals("Going home")) {
                input = (scanner.nextLine());
                int steps = Integer.parseInt(input);
                sumSteps += steps;
                break;
            }
            int steps = Integer.parseInt(input);
            sumSteps += steps;
        }

        if (sumSteps >= 10000) {
            System.out.println("Goal reached! Good job!");
            System.out.printf("%d steps over the goal!", sumSteps - 10000);
        } else {
            System.out.printf("%d more steps to reach goal.", (10000 - sumSteps));
        }
    }

}

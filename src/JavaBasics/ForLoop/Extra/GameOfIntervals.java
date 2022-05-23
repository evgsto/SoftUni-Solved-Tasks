package JavaBasics.ForLoop.Extra;

import java.util.Scanner;

public class GameOfIntervals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double turns = Double.parseDouble(scanner.nextLine());
        double result = 0;
        double secondRow = 0;
        double thirdRow = 0;
        double forthRow = 0;
        double fifthRow = 0;
        double sixthRow = 0;
        double invalid = 0;

        for (int i = 0; i < turns; i++) {
            int num = Integer.parseInt(scanner.nextLine());

            if (num >= 0 && num < 10) {
                result += num * 0.20;
                secondRow++;
            } else if (num >= 10 && num < 20) {
                result += num * 0.30;
                thirdRow++;
            } else if (num >= 20 && num < 30) {
                result += num * 0.40;
                forthRow++;
            } else if (num >= 30 && num < 40) {
                result += 50;
                fifthRow++;
            } else if (num >= 40 && num <= 50) {
                result += 100;
                sixthRow++;
            }else {
                result/=2;
                invalid++;
            }
        }
        System.out.printf("%.2f%n",result);
        System.out.printf("From 0 to 9: %.2f%%%n",secondRow/turns*100);
        System.out.printf("From 10 to 19: %.2f%%%n",thirdRow/turns*100);
        System.out.printf("From 20 to 29: %.2f%%%n",forthRow/turns*100);
        System.out.printf("From 30 to 39: %.2f%%%n",fifthRow/turns*100);
        System.out.printf("From 40 to 50: %.2f%%%n",sixthRow/turns*100);
        System.out.printf("Invalid numbers: %.2f%%",invalid/turns*100);

    }
}

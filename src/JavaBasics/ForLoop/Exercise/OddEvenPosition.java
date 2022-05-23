package JavaBasics.ForLoop.Exercise;

import java.util.Scanner;

public class OddEvenPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double oddSum = 0;
        double evenSum = 0;
        double oddMin = Double.POSITIVE_INFINITY;
        double oddMax = Double.NEGATIVE_INFINITY;
        double evenMin = Double.POSITIVE_INFINITY;
        double evenMax = Double.NEGATIVE_INFINITY;
        boolean noOdd = false;
        boolean noEven = false ;

        for (int i = 1; i <= n; i++) {
            double input = Double.parseDouble(scanner.nextLine());

            if (n == 1) {
                evenMax = evenMin = input;
                oddMax = oddMin= input;
            }


            if (i % 2 == 0) {
                evenSum += input;
                noEven = true;
                   if (input > evenMax) {
                    evenMax = input;
                }
                   if (input < evenMin) {
                    evenMin = input;
                }


            } else {
                oddSum += input;
                noOdd = true;
                if (input > oddMax) {
                    oddMax = input;

                }
                if (input < oddMin) {
                    oddMin = input;
                }
            }


        }
        System.out.printf("OddSum=%.2f,%n", oddSum);
        if (noOdd) {
            System.out.printf("OddMin=%.2f,%n", oddMin);
            System.out.printf("OddMax=%.2f,%n", oddMax);
        }else {
            System.out.println("OddMin=No,");
            System.out.println("OddMax=No,");

        }


        System.out.printf("EvenSum=%.2f,%n", evenSum);
        if (noEven) {
            System.out.printf("EvenMin=%.2f,%n", evenMin);
            System.out.printf("EvenMax=%.2f%n", evenMax);
        }else {
            System.out.println("EvenMin=No,");
            System.out.println("EvenMax=No");
        }

    }
}

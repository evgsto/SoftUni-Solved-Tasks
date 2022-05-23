package JavaBasics.NestedLoops.Exercise;

import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int juri = Integer.parseInt(scanner.nextLine());
        double  curentResult = 0;
        double totalResult = 0 ;
        int counter = 0;
        int presentationCounter =0;

        String presentName = scanner.nextLine();
        while (!presentName.equals("Finish")) {

            for (int i = 1; i <= juri; i++) {
                double result = Double.parseDouble(scanner.nextLine());
                curentResult += result;
                presentationCounter++;
                counter++;
                if (counter==juri) {
                    System.out.printf("%s - %.2f.%n", presentName, curentResult / juri);
                    totalResult+=curentResult;
                    curentResult = 0;
                    counter = 0;
                }

            }

            presentName= scanner.nextLine();
        }
        System.out.printf("Student's final assessment is %.2f.",totalResult/presentationCounter);

    }
}

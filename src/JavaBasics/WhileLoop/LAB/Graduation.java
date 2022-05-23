package JavaBasics.WhileLoop.LAB;

import java.util.Scanner;

public class Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int grade = 1;
        int fail = 0;
        double sum = 0;
        while (grade<= 12) {

     double  evaluation = Double.parseDouble(scanner.nextLine());

            if (evaluation >= 4.00) {
                grade++;
                fail = 0;
                sum+=evaluation;
            } else {
                fail++;
                if (fail>1){
                    System.out.printf("%s has been excluded at %d grade",name,grade);
                    break;

            }

            }
        }
        if (grade>12) {
            System.out.printf("%s graduated. Average grade: %.2f", name, sum / 12);
        }

    }
}

package JavaBasics.NestedLoops.Exercise;

import java.util.Scanner;

public class EqualSumsEvenOddPosition {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());

        int evenSum = 0;
        int oddSum = 0;

        for (int i = num1; i <= num2 ; i++) {
            int currentNum    = i ;
            for (int j = 0; j < 6; j++) {
                 int result = currentNum % 10;
                 currentNum = currentNum/10;
                if (j%2 == 0 ){
                    evenSum+=result;
                }else {
                    oddSum+=result;
                }
            }


            if (evenSum==oddSum) {
                System.out.print(i);
                System.out.print(" ");
                evenSum = 0 ;
                oddSum = 0;

            }else {
                evenSum = 0 ;
                oddSum = 0;
            }
        }






    }
}

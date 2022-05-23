package JavaFundamentals.Revision.MoreExercise;

import java.util.Scanner;

public class Messages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counts = Integer.parseInt(scanner.nextLine());   // reads number of inputs



        for (int i = 0; i < counts; i++) {
            String input = scanner.nextLine();

            int interval = Integer.parseInt(input);             // get 0 for interval
            if (interval == 0) {
                System.out.print(" ");
                continue;
            }
            int numDigits = input.length();                      // get number of digits
            char mainDigitChar = input.charAt(0);                    // get main digit
            int mainDigit = Integer.parseInt(String.valueOf(mainDigitChar));   // convert char to int

            int offsetNum = (mainDigit - 2) * 3;

            if (mainDigit == 8 || mainDigit == 9) {
                offsetNum++;
            }
            int letterIndex = offsetNum + numDigits - 1;


            char finalLetter = 97;
            finalLetter += letterIndex;
            System.out.print(finalLetter);


        }


    }
}

package JavaBasics.ContestSoftUni;

import java.util.Scanner;

public class LettersCombinations1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String firstLetter = scanner.nextLine();
        String endLetter = scanner.nextLine();
        String skipLetter = scanner.nextLine();

        int first = firstLetter.charAt(0);
        int end = endLetter.charAt(0);
        int skip = skipLetter.charAt(0);
        int counter = 0 ;


        for (int i = first; i <= end; i++) {
            for (int j = first; j <= end; j++) {
                for (int k = first; k <= end; k++) {
                    if (i == skip || j == skip || k == skip) {
                        continue;
                    }

                    System.out.printf("%s%s%s", (char) i, (char) j, (char) k);
                    System.out.print(" ");
                    counter++;


                }

            }
        }
        System.out.print(counter);
    }
}




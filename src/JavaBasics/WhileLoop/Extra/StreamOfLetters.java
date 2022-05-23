package JavaBasics.WhileLoop.Extra;

import java.util.Scanner;

public class StreamOfLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int nCount = 0;
        int cCount = 0;
        int oCount = 0;
        String word = "";

        while (!input.equals("End")) {
            char letter = input.charAt(0);
            if (letter < 'A' || letter > 'Z' && letter < 'a' || letter > 'z') {
                input = scanner.nextLine();
                continue;
            }
            if (input.equals("n") && nCount == 0) {
                nCount++;
            } else if (input.equals("c") && cCount == 0) {
                cCount++;
            } else if (input.equals("o") && oCount == 0) {
                oCount++;
            } else {
                    word += input;
            }
            if (nCount==1 && cCount==1 && oCount ==1){
                System.out.print(word+" ");
                nCount = 0;
                cCount = 0;
                oCount = 0;
                word = "";
            }

            input = scanner.nextLine();
        }



    }
}

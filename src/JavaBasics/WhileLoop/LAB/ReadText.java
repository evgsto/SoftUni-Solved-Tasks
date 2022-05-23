package JavaBasics.WhileLoop.LAB;

import java.util.Scanner;

public class ReadText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        while (true) {
            if (text.equals("Stop")) {
                break;
            }
            System.out.println(text);
            text = scanner.nextLine();
        }
    }
}


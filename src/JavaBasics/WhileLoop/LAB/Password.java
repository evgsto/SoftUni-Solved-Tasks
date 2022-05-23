package JavaBasics.WhileLoop.LAB;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        String pass = scanner.nextLine();
        String  login = scanner.nextLine();
        while (!login.equals(pass)) {

            login = scanner.nextLine();
        }
        System.out.printf("Welcome %s!",name   );
    }
}

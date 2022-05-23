package JavaFundamentals.Revision.Exercise;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        String inputPass = scanner.nextLine();
        String pass = "";
        int failCout = 0;

        for (int i = name.length() - 1; i >= 0; i--) {
            pass += name.charAt(i);
        }

        while (!inputPass.equals(pass)) {
            failCout++;
            if (failCout == 4 ) {
                System.out.printf("User %s blocked!", name);
                break;
            }

            System.out.println("Incorrect password. Try again.");
            inputPass = scanner.nextLine();
        }
        if (inputPass.equals(pass)) {
            System.out.printf("User %s logged in.", name);
        }
    }
}

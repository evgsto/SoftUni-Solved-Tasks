package JavaBasics.ConditionalStatments.Extra;

import java.util.Scanner;

public class PersonalTitles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double age = Double.parseDouble(scanner.nextLine());
        String sex = scanner.nextLine();


        switch (sex) {
            case "m":
                if (age >= 16.00) {
                    System.out.println("Mr.");
                } else {
                    System.out.println("Master");
                }
                break;

            case "f":
                if (age >= 16.00) {
                    System.out.println("Ms.");
                } else {
                    System.out.println("Miss");
                }
                break;


        }


    }
}

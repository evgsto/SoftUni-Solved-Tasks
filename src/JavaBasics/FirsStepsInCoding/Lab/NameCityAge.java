package JavaBasics.FirsStepsInCoding.Lab;

import java.util.Scanner;

public class NameCityAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // променливи Име , Фамилия , възраст ; град
        String name = scanner.nextLine();
        String family = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        String town = scanner.nextLine();
      System.out.println("You are "+ name + " " + family + "," + age + " "+ "years old person from" + " " + " " + town);

    }
}

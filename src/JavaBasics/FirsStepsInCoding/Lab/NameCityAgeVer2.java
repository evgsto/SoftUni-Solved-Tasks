package JavaBasics.FirsStepsInCoding.Lab;

import java.util.Scanner;

public class NameCityAgeVer2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String family = scanner.nextLine();
                int age = Integer.parseInt(scanner.nextLine());
        String town = scanner.nextLine();
        System.out.printf("You are %s %s, a %d-years old person from %s.",name , family , age ,town );
    }
}

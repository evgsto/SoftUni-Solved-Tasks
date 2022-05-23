package JavaBasics.FirsStepsInCoding.Exercises;

import java.util.Scanner;

public class VacationBooksList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int BookPages = Integer.parseInt(scanner.nextLine());
        int PagesPerHour = Integer.parseInt(scanner.nextLine());
        int Days = Integer.parseInt(scanner.nextLine());
        int NeedHours = (BookPages/PagesPerHour) ;
        System.out.println(NeedHours/Days);
    }
}

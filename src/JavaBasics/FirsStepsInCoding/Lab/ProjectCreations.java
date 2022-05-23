package JavaBasics.FirsStepsInCoding.Lab;

import java.util.Scanner;

public class ProjectCreations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // входни данни Име архитект , брой проекти за изготвяне
        String name = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());
        int result = count*3;
            // изход •	"The architect {името на архитекта} will need {необходими часове} hours to complete {брой на проектите} project/s."
        System.out.printf("The architect %s will need %d hours to complete %d project/s.",name , result , count );


    }
}

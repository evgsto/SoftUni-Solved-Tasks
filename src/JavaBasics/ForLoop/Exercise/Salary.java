package JavaBasics.ForLoop.Exercise;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tabs = Integer.parseInt(scanner.nextLine());
        int salary = Integer.parseInt(scanner.nextLine());
        int penalty = 0;
        for (int i = 0; i < tabs; i++) {
            String site = scanner.nextLine();
            switch (site) {
                case "Facebook":
                    penalty += 150;
                    break;
                case "Instagram":
                    penalty += 100;
                    break;
                case "Reddit":
                    penalty += 50;
                    break;
            }
            if (salary <= penalty) {
                System.out.println("You have lost your salary.");
                break;
            }
        }
        if (salary > penalty) {
            System.out.println(salary - penalty);
        }
    }

}

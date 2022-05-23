package JavaBasics.WhileLoop.Exercise;

import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int examAttempts = Integer.parseInt(scanner.nextLine());


        String lastTask = "";
        int failedExams = 0;
        double sum = 0;
        int taskCount = 0;
        boolean succeded = false;


        while (examAttempts > failedExams) {

            String task = scanner.nextLine();
            if (task.equals("Enough")) {
                succeded = true;
                System.out.printf("Average score: %.2f%n", sum / taskCount);
                System.out.printf("Number of problems: %d%n", taskCount);
                System.out.printf("Last problem: %s", lastTask);
                break;
            }
            lastTask = task;
            int result = Integer.parseInt(scanner.nextLine());
            if (result <= 4) {
                failedExams++;
            }

            sum += result;
            taskCount++;
        }
        if (!succeded) {
            System.out.printf("You need a break, %d poor grades.", failedExams);
        }

    }

}


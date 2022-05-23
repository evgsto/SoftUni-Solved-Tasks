package JavaBasics.ConditionalStatments.Extra;


import java.util.Scanner;

public class OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hourExam = Integer.parseInt(scanner.nextLine());
        int minExam = Integer.parseInt(scanner.nextLine());
        int hourComing = Integer.parseInt(scanner.nextLine());
        int minComing = Integer.parseInt(scanner.nextLine());

        String message = "unknown";

        int minutesExam = hourExam * 60 + minExam; // Time Exam
        int minutesComing = hourComing * 60 + minComing; // time coming to exam

        int result = Math.abs(minutesExam - minutesComing);

        int finalHour = result / 60;
        int finalmin = result % 60;

        if (finalHour > 23) {
            finalHour = 0;
        }



        if (minutesExam < minutesComing) {
            message = "Late";
        } else if (minutesExam == minutesComing) {
            message = "On time";
        } else if (result <= 30) {
            message = "On time";
        } else  {
            message = "Early";
        }
        System.out.println(message);


        switch (message) {
            case "Late":
                if (finalHour == 0) {
                    System.out.printf("%d minutes after the start",finalmin);
                }else if (finalmin < 10){
                    System.out.printf("%d:0%d hours after the start" ,finalHour,finalmin);
                }
                else {
                    System.out.printf("%d:%d hours after the start",finalHour,finalmin);
                }
                break;
            case "On time":
                if (minutesExam == minutesComing) {
                } else if (result <= 30) {
                    System.out.printf("%d minutes before the start",finalmin);
                }
                break;
            case "Early":
                if (finalHour == 0) {
                    System.out.printf("%d minutes before the start",finalmin);
                }else if (finalmin < 10){
                    System.out.printf("%d:0%d hours before the start",finalHour,finalmin);
                }
                else {
                    System.out.printf("%d:%d hours before the start",finalHour,finalmin);
                }
                break;
        }


    }
}

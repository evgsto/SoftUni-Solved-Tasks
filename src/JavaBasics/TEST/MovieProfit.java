package JavaBasics.TEST;

import java.util.Scanner;

public class MovieProfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());
        int count  = Integer.parseInt(scanner.nextLine());
        Double ticketPrice   = Double.parseDouble(scanner.nextLine());
       double    percent    = Double.parseDouble(scanner.nextLine());

        Double sumTicket = days*count*ticketPrice;
        percent = percent/100;
        double totalPrice =  sumTicket - (sumTicket*percent);
        System.out.printf("The profit from the movie %s is %.2f lv.",name,totalPrice);



    }
}

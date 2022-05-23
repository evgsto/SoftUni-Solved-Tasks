package JavaBasics.ConditionalStatments.Extra;

import java.util.Scanner;

public class CinemaTicket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String day = scanner.nextLine();
            //Monday	Tuesday	     Wednesday  	Thursday	Friday	Saturday	Sunday
             //12        	12	        14	          14	     12     	16	       16
        switch (day) {
            case "Monday" :
            case "Tuesday" :
            case "Friday" :
                System.out.println("12");
                break;
            case "Wednesday":
            case "Thursday":
                System.out.println("14");
                break;
            case "Saturday":
            case "Sunday":
                System.out.println("16");
                break;
        }
    }
}

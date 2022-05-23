package JavaFundamentals.Revision.Exercise;



import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int peoples = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        String day = scanner.nextLine();
        double price = 0 ;
        double discount = 0 ;
        switch (type){
            case "Students":
                if (peoples>=30){
                    discount=0.15;
                }
                switch (day){
                    case "Friday":
                        price = 8.45;
                        break;
                    case "Saturday":
                        price = 9.80;
                        break;
                    case "Sunday":
                        price = 10.46;
                        break;
                }
                break;
            case "Business":
                if(peoples>=100){
                    peoples-=10;
                }
                switch (day) {
                    case "Friday":
                        price = 10.90;
                        break;
                    case "Saturday":
                        price = 15.60;
                        break;
                    case "Sunday":
                        price = 16;
                        break;
                }
                break;
            case "Regular":
                if(peoples>=10 && peoples<=20){
                    discount=0.05;
                }
                switch (day) {
                    case "Friday":
                        price = 15;
                        break;
                    case "Saturday":
                        price = 20;
                        break;
                    case "Sunday":
                        price = 22.50;
                        break;
                }
                break;
        }
        double total = peoples*price;
        System.out.printf("Total price: %.2f",total-(total*discount));

    }
}

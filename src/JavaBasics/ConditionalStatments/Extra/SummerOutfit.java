package JavaBasics.ConditionalStatments.Extra;

import java.util.Scanner;

public class SummerOutfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int celsius = Integer.parseInt(scanner.nextLine());
        String time = scanner.nextLine();

        switch (time) {
         case "Morning" :
             if (celsius>= 10 && celsius<= 18){
                 System.out.printf("It's %d degrees, get your Sweatshirt and Sneakers.",celsius);
             }else if (celsius > 18 && celsius<= 24){
                 System.out.printf("It's %d degrees, get your Shirt and Moccasins.",celsius);
             }else if (celsius>=24) {
                 System.out.printf("It's %d degrees, get your T-Shirt and Sandals.",celsius);
             }
             break;

            case "Afternoon":
                if (celsius>= 10 && celsius<= 18){
                    System.out.printf("It's %d degrees, get your Shirt and Moccasins.",celsius);
                }else if (celsius > 18 && celsius<= 24){
                    System.out.printf("It's %d degrees, get your T-Shirt and Sandals.",celsius);
                }else if (celsius>=24) {
                    System.out.printf("It's %d degrees, get your Swim Suit and Barefoot.",celsius);
                }
                break;

            case "Evening":
                System.out.printf("It's %d degrees, get your Shirt and Moccasins.",celsius);
                break;
     }

    }
}

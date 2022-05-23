package JavaBasics.ConditionalStatments.Extra;

import java.util.Scanner;

public class FlowerShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //•	Магнолии – 3.25 лева
        //•	Зюмбюли – 4 лева
        //•	Рози – 3.50 лева
        //•	Кактуси – 8 лева


        int magnolia = Integer.parseInt(scanner.nextLine());
        int hyacinths = Integer.parseInt(scanner.nextLine());
        int roses = Integer.parseInt(scanner.nextLine());
        int cactus  = Integer.parseInt(scanner.nextLine());
        double present = Double.parseDouble(scanner.nextLine());

        double sum = magnolia*3.25 + hyacinths*4.00 + roses*3.50 + cactus*8.00;
        sum = sum - (sum*0.05);

        if (sum>=present){
            System.out.printf("She is left with %.0f leva.",Math.floor((sum-present)));
        }else {
            System.out.printf("She will have to borrow %.0f leva.",Math.ceil((present-sum)));
        }



    }
}

package JavaBasics.WhileLoop.Extra;

import java.util.Scanner;

public class Dishwasher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bottles = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int counter = 0;
        //бутилка съдържа 750 мл. препарат, за 1 чиния са нужни 5 мл., а за тенджера 15 мл.
        int detergentVol = 750 * bottles;
        int dishVol = 0 ;
        int potsVol = 0 ;
        int pots = 0;
        int dish = 0;

        boolean enaught = true ;

        while (!input.equals("End")){
            int vesselsCount = Integer.parseInt(input);
            counter++ ;
            if (counter%3 == 0) {
                potsVol+=15*vesselsCount;
                pots+=vesselsCount;
            }else {
                dishVol+=5*vesselsCount;
                dish+=vesselsCount;
            }
            if (potsVol+dishVol > detergentVol){
                System.out.printf("Not enough detergent, %d ml. more necessary!",(potsVol+dishVol)-detergentVol);
                enaught = false ;
                break;
            }

            input = scanner.nextLine();
        }
        if (enaught) {
            System.out.println("Detergent was enough!");
            System.out.printf("%d dishes and %d pots were washed.%n",dish,pots);
            System.out.printf("Leftover detergent %d ml.",detergentVol-(dishVol+potsVol));
        }

    }
}

package JavaBasics.FirsStepsInCoding.Lab;

import java.util.Scanner;

public class Greening {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        // резултат е нуйната сума , 1 квадрат е 7.61 , 18% отстъпка за на краина цена
        double squares = Double.parseDouble(scanner.nextLine());
        double price = squares * 7.61 ;
        double discount =  price*0.18;
        double FinalPrice = price-discount;
        System.out.printf("The final price is: %f lv.", FinalPrice);
        System.out.println();
        System.out .printf("The discount is: %f lv.", discount);

    }
}

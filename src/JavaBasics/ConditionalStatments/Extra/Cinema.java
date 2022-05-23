package JavaBasics.ConditionalStatments.Extra;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String projection = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int colums = Integer.parseInt(scanner.nextLine());
        double price = 0;
        double sum = 0 ;
        //•	Premiere – премиерна прожекция, на цена 12.00 лева.
        //•	Normal – стандартна прожекция, на цена 7.50 лева.
        //•	Discount – прожекция за деца, ученици и студенти на намалена цена от 5.00 лева.

        if (projection.equals("Premiere")) {
price= 12.00 ;
        }else if (projection.equals("Normal")){
            price = 7.50;
        }else if (projection.equals("Discount")) {
            price = 5.00;
        }
        sum= rows*colums*price ;
        System.out.printf("%.2f",sum);
    }
}

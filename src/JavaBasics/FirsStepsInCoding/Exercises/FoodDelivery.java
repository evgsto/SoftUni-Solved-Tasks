package JavaBasics.FirsStepsInCoding.Exercises;

import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //•	Пилешко меню –  10.35 лв.
        //•	Меню с риба – 12.40 лв.
        //•	Вегетарианско меню  – 8.15 лв.
        //и десерт = 20% т вси4ко без доставката
        // доставка 2.50лв
        int chicken = Integer.parseInt(scanner.nextLine());
        int fish = Integer.parseInt(scanner.nextLine());
        int vegs = Integer.parseInt(scanner.nextLine());
        double desert = (chicken*10.35 + fish*12.40 + vegs*8.15)*20/100.00 ;
        double sum = (chicken*10.35 + fish*12.40 + vegs*8.15)+desert+2.50;
        System.out.println(sum);


    }
}

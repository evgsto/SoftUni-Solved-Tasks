package JavaBasics.FirsStepsInCoding.Exercises;

import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //•	Баскетболни кецове – цената им е 40% по-малка от таксата за една година
        //•	Баскетболен екип – цената му е 20% по-евтина от тази на кецовете
        //•	Баскетболна топка – цената ѝ е 1 / 4 от цената на баскетболния екип
        //•	Баскетболни аксесоари – цената им е 1 / 5 от цената на баскетболната топка
        int tax = Integer.parseInt(scanner.nextLine());
        double shoes =  tax-(tax*(40/100.00));
        double outfit = shoes - (shoes*(20/100.00));
        double ball = outfit/4.00;
        double acc = ball/5.00;
        System.out.println(tax+shoes+outfit+ball+acc);
    }
}

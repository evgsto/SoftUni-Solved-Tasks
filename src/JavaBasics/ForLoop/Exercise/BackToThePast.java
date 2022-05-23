package JavaBasics.ForLoop.Exercise;

import java.util.Scanner;

public class BackToThePast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double heritage = Double.parseDouble(scanner.nextLine());
        int yearLiving = Integer.parseInt(scanner.nextLine());
        double spendMoney = 0;
        int ivanYears = 17;
        for (int i = 1800; i <= yearLiving; i++) {
            ivanYears++;
            if (i % 2 == 0) {
                spendMoney += 12000;
            } else {
                spendMoney += 12000 + (50 * ivanYears);
            }
        }
        if (heritage >= spendMoney) {
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.", heritage - spendMoney);
        } else {
            System.out.printf("He will need %.2f dollars to survive.", spendMoney - heritage);
        }
    }

}

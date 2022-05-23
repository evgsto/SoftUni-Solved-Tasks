package JavaBasics.ConditionalStatments.Exercises;

import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double record = Double.parseDouble(scanner.nextLine());
        double lenght = Double.parseDouble(scanner.nextLine());
        double time = Double.parseDouble(scanner.nextLine());

        double  resistance = Math.floor(lenght / 15) * 12.5;

        double needTime = time * lenght + resistance;

        if (needTime < record) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", needTime);
        } else {
            System.out.printf("No, he failed! He was %.2f seconds slower.", Math.abs(record - needTime));
        }


    }
}

package JavaBasics.FirsStepsInCoding.Exercises;

import java.util.Scanner;

public class FishTank {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lenght = Integer.parseInt(scanner.nextLine());
        int widht = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double surface = Double.parseDouble(scanner.nextLine());
        double volume = (lenght * widht * height)/1000.00;
                double litres = volume - (volume*(surface/100.00));
                System.out.println(litres);



    }
}

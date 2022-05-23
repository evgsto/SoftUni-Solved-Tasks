package JavaBasics.Contest2;

import java.util.Scanner;

public class PuppyCare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int foodCount = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        foodCount = foodCount*1000;
        int totalEated = 0;

        while (!input.equals("Adopted")){
            int eatedFood = Integer.parseInt(input);
            totalEated+=eatedFood;

            input= scanner.nextLine();
        }

        if (foodCount>=totalEated){
            System.out.printf("Food is enough! Leftovers: %d grams.",foodCount-totalEated);

        }else {
            System.out.printf("Food is not enough. You need %d grams more.",totalEated-foodCount);
        }


    }
}

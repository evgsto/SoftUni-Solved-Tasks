package JavaBasics.FirsStepsInCoding.Lab;

import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double DogFood = 2.5 ;
        int CatFood = 4 ;
        int CountDogFood = Integer.parseInt(scanner.nextLine());
        int CountCatFood = Integer.parseInt(scanner.nextLine());
        double result= CountDogFood*DogFood + CountCatFood*CatFood;
        System.out.printf("%f lv", result );
    }
}

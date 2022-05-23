package JavaFundamentals.Revision.MoreExercise;

import java.util.Scanner;

public class EnglishNameOfTheLastDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());
        input = input%10;
        String output = "";
        switch (input){
            case 0 :
                output = "zero";
                break;
            case 1 :
                output = "one";
                break;
            case 2 :
                output = "two";
                break;
            case 3 :
                output = "three";
                break;
            case 4 :
                output = "four";
                break;
            case 5 :
                output = "five";
                break;
            case 6 :
                output = "six";
                break;
            case 7 :
                output = "seven";
                break;
            case 8 :
                output = "eight";
                break;
            case 9 :
                output = "nine";
                break;
        }
        System.out.println(output);



    }
}

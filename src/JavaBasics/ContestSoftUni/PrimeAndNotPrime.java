package JavaBasics.ContestSoftUni;

import java.util.Scanner;

public class PrimeAndNotPrime {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);


        int num = Integer.parseInt(scanner.nextLine());
        boolean prime = false ;

        for (int i = 2; i <= num/2 ; i++) {
            // Простото число е > 1  ----> i = 2
            // Простото число се дели на себе си :  i <=num/2 <---- о този начин
            if (num % i  == 0 ){
                prime = true;
                break;
            }

        }
        if (!prime)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is NOT a prime number.");
    }


}

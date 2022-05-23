package JavaBasics.WhileLoop.LAB;

import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());


        int input = Integer.parseInt(scanner.nextLine());
        int  sum = input;

        while ( num>sum )  {
       input = Integer.parseInt(scanner.nextLine());
            sum+= input ;
        }
        System.out.println(sum);


    }
}

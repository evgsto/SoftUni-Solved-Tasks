package JavaBasics.ConditionalStatments.Lab;

import java.util.Scanner;

public class ChallengeTheWedding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int mans = Integer.parseInt(scanner.nextLine());
        int womens = Integer.parseInt(scanner.nextLine());
        int tables  = Integer.parseInt(scanner.nextLine());
        int counter = 0 ;



            for (int i = 1; i <=mans  ; i++) {
                for (int j = 1; j <=womens ; j++) {
                    counter++;
                    if (counter>tables){
                        break;
                    }
                    System.out.printf("(%d <-> %d)",i,j);
                    System.out.print(" ");

                }
            }







    }
}


package JavaBasics.Contest2;

import java.util.Scanner;

public class GiftsFromSanta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());
        int s = Integer.parseInt(scanner.nextLine());

        for (int i = m; i >= n ; i--) {

            if (i%2==0 && i%3==0){
                if (i==s){
                    break;
                }
                System.out.print(i);
                System.out.print(" ");
            }
            
        }


    }
}

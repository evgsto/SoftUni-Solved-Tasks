package JavaFundamentals.Revision.Exercise;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());
        int facturiel = 1;
        int sum = 0;
        int currentNum = 0 ;
        for (int i = input; i > 0 ;i/=10 ) {

            currentNum = i%10;
            for (int j = 1; j <= currentNum ; j++) {
                facturiel*=j;
            }
            sum+=facturiel;
            facturiel= 1;

        }
        if(input==sum){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }

}

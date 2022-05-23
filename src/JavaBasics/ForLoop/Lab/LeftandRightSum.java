package JavaBasics.ForLoop.Lab;

import java.util.Scanner;

public class LeftandRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum1 = 0;
        int sum2 = 0;
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            int num1 = Integer.parseInt(scanner.nextLine());

            sum1 += num1;
        }
        for (int i = 0; i < n; i++) {
            int num2 = Integer.parseInt(scanner.nextLine());
            sum2  +=num2;
        }
        if (sum1==sum2){
            System.out.println("Yes, sum = "+sum1);
        }else {
            System.out.println("No, diff = "+Math.abs(sum1-sum2));
        }

    }
}

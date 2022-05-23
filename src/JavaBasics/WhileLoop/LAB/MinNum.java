package JavaBasics.WhileLoop.LAB;

import java.util.Scanner;

public class MinNum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int minNum= Integer.MAX_VALUE;
        while (!input.equals("Stop")) {
            int num = Integer.parseInt(input);
            if (num<minNum) {
                minNum = num;
            }

            input = scanner.nextLine();
        }
        System.out.println(minNum);
        





    }

}

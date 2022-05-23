package JavaBasics.NestedLoops.Exercise;

import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int current = 1 ;
        boolean flag = true;

        for (int row = 1; row <= n ; row++) {
            for (int cols = 1 ; cols <= row ; cols++) {
            if (current > n ) {
                flag = false;
                break;
            }
                System.out.printf("%d ",current);
                current++;
            }
            if (flag) {
                System.out.println();
            }
        }




    }
}

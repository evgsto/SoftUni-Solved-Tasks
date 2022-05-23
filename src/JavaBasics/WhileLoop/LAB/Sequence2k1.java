package JavaBasics.WhileLoop.LAB;

import java.util.Scanner;

public class Sequence2k1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int next =1 ;
        while (n>=next ){
            System.out.println(next);
         next = next*2+1;

        }
    }
}

package JavaBasics.JavaBookPrograms;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String  a = scanner.nextLine() ;
        int size = a.length();


        for (int i = size-1; i >= 0 ; i--) {
            System.out.print(a.charAt(i));

        }



    }
}

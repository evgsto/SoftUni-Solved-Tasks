package JavaBasics.ContestSoftUni;

import java.util.Scanner;

public class CarNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int first = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());

        for (int i = first; i <=end ; i++) {
            for (int j = first; j <=end ; j++) {
                for (int k = first; k <=end ; k++) {
                    for (int l = first; l <=end ; l++) {
                        if(i%2==0 && !(l%2==0)  || !(i%2==0) && l%2==0  ) {
                            if(i>l) {
                                    if ((j+k)%2==0) {
                                        System.out.printf("%d%d%d%d", i, j, k, l);
                                        System.out.print(" ");
                                    }
                            }

                        }





                    }
                }
            }
        }        

    }
}

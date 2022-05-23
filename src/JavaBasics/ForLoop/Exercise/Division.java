package JavaBasics.ForLoop.Exercise;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner scannner = new Scanner(System.in);

        int n = Integer.parseInt(scannner.nextLine());
        int p2 = 0;
        int p3 = 0;
        int p4 = 0;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(scannner.nextLine());
                if (num%2==0) {
                    p2++;
                }
                if (num%3==0){
                    p3++;
                }
                if (num%4==0){
                    p4++;
                }

        }

        double percent = n;
        System.out.printf("%.2f%%%n",p2/percent*100);
        System.out.printf("%.2f%%%n",p3/percent*100);
        System.out.printf("%.2f%%%n",p4/percent*100);


    }
}

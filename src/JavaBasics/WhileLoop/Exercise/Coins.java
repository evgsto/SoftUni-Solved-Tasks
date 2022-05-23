package JavaBasics.WhileLoop.Exercise;

import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = Double.parseDouble(scanner.nextLine());
        sum = sum * 100;
        int coin = 0;
        while (sum != 0) {
            if (sum >= 200) {
                coin++;
                sum -= 200;
            } else if (sum >= 100) {
                coin++;
                sum -= 100;
            } else if (sum >= 50) {
                coin++;
                sum -= 50;
            }else if (sum>=20){
                coin++;
                sum-=20;
            }else if(sum>=10){
                coin++;
                sum-=10;
            }else if (sum>=5){
                coin++;
                sum-=5;
            }else if (sum>=2){
                coin++;
                sum-=2;
            }else if (sum>=1){
                coin++;
                sum-=1;

            }else{
                sum = 0;
            }

        }
        System.out.println(coin);

          }
}

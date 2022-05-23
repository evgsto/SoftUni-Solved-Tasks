package JavaBasics.ForLoop.Exercise;

import java.util.Scanner;

public class TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int groups = Integer.parseInt(scanner.nextLine());


        int musala = 0;
        int monblan = 0;
        int kili = 0;
        int k2 = 0;
        int everest = 0;

        for (int i = 0; i < groups; i++) {
            int peoples = Integer.parseInt(scanner.nextLine());
            if (peoples<=5){
                musala += peoples;
            }else if (peoples<=12){
                monblan+=peoples;
            }else if (peoples<=25){
                kili+=peoples;
            }else if (peoples<=40){
                k2 += peoples;
            }else {
                everest+=peoples;
            }
        }
        double  ppl = musala+monblan+kili+k2+everest;
        System.out.printf("%.2f%%%n",(musala/ppl)*100);
        System.out.printf("%.2f%%%n",(monblan/ppl)*100);
        System.out.printf("%.2f%%%n",(kili/ppl)*100);
        System.out.printf("%.2f%%%n",(k2/ppl)*100);
        System.out.printf("%.2f%%%n",(everest/ppl)*100);

    }
}

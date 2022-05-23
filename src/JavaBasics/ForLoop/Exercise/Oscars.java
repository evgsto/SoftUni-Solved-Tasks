package JavaBasics.ForLoop.Exercise;

import java.util.Scanner;

public class Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        double points = Double.parseDouble(scanner.nextLine());
        int  judje = Integer.parseInt(scanner.nextLine());



        for (int i = 0; i < judje; i++) {
            String nameJudje = scanner.nextLine();
            double judjePoints = Double.parseDouble(scanner.nextLine());
            points += (nameJudje.length()*judjePoints)/2;
            if (points>1250.5) {
                System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!",name,points);
                break;
            }

        }
        if (points<1250.5){
            System.out.printf("Sorry, %s you need %.1f more!",name,1250.5-points);
        }
    }
}

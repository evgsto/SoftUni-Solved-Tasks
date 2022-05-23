package JavaBasics.ConditionalStatments.Extra;

import java.util.Scanner;

public class PointOnRectangleBorder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        double x1 = Double.parseDouble(scanner.nextLine());
        double y1 = Double.parseDouble(scanner.nextLine());
        double x2 = Double.parseDouble(scanner.nextLine());
        double y2 = Double.parseDouble(scanner.nextLine());
        double X = Double.parseDouble(scanner.nextLine());
        double Y = Double.parseDouble(scanner.nextLine());



       if (( X == x1 || X == x2) && ( Y>=y1 && Y<=y2)) {
           System.out.println("Border");
        }else if ((Y==y1 || Y == y2) &&  (X>=x1 && X<=x2)) {
           System.out.println("Border");
        }
       else {
           System.out.println("Inside / Outside");
       }

    }

}
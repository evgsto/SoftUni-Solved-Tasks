package JavaFundamentals.Revision.LAB;

import java.util.Scanner;

public class BackIn30Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int iniHour= Integer.parseInt(scanner.nextLine());
        int iniMin= Integer.parseInt(scanner.nextLine());

        int totalMin = iniHour*60 + iniMin + 30 ;

        int hour = totalMin/60;
        int min  = totalMin%60;
        if (hour>23){
            hour = 0 ;
        }
        System.out.printf("%d:%02d",hour,min);


    }
}

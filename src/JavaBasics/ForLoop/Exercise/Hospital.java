package JavaBasics.ForLoop.Exercise;

import java.util.Scanner;

public class Hospital {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int period = Integer.parseInt(scanner.nextLine());


        int doctors = 7;
        int unTreated = 0;
        int therated = 0;


        for (int i = 1; i <= period; i++) {
            int pacients = Integer.parseInt(scanner.nextLine());

            if (i % 3 == 0) {
                if (unTreated > therated) {
                    doctors++;
                }
            }
            if (doctors>pacients){
                therated+=pacients;
            }else {
                therated+=doctors;
            }

            if (pacients > doctors) {
                unTreated += pacients - doctors;
            }
        }
        System.out.printf("Treated patients: %d.%n",therated);
        System.out.printf("Untreated patients: %d.%n",unTreated);
    }
}

package JavaBasics.ForLoop.Exercise;

import java.util.Scanner;

public class FootballLeague {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double stadiumCapacity = Double.parseDouble(scanner.nextLine());
        int allFans = Integer.parseInt(scanner.nextLine());
        double sectorA = 0;
        double sectorB = 0;
        double sectorV = 0;
        double sectorG = 0;
        double sectorALL = sectorA+sectorB+sectorV+sectorG;


        for (int i = 0; i < allFans; i++) {
            String sector = scanner.nextLine();
                switch (sector) {
                    case "A":
                        sectorA++;
                        break;
                    case "B":
                        sectorB++;
                        break;
                    case "V":
                        sectorV++;
                        break;
                    case "G":
                        sectorG++;
                        break;
                }
                    if (sectorALL >= stadiumCapacity) {
                        break;
                    }
            
        }
        System.out.printf("%.2f%%%n",sectorA/allFans*100);
        System.out.printf("%.2f%%%n",sectorB/allFans*100);
        System.out.printf("%.2f%%%n",sectorV/allFans*100);
        System.out.printf("%.2f%%%n",sectorG/allFans*100);
        System.out.printf("%.2f%%%n",allFans/stadiumCapacity*100);


    }
}

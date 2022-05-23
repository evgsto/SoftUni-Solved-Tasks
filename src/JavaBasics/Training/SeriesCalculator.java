package JavaBasics.Training;

import java.util.Scanner;

public class SeriesCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String name = scanner.nextLine();
        int seasonCount = Integer.parseInt(scanner.nextLine());
        double  episodes = Double.parseDouble(scanner.nextLine());
        double timeEpisode = Double.parseDouble(scanner.nextLine());

        double comercials = timeEpisode*0.20;

        double  time = 0;
        timeEpisode= timeEpisode+comercials;
        time = seasonCount*(episodes*timeEpisode)+(seasonCount*10);

        System.out.printf("Total time needed to watch the %s series is %.0f minutes.",name,Math.floor(time));



    }
}

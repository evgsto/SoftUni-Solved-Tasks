package JavaBasics.TEST;

import java.util.Scanner;

public class MovieRatings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int filmCount = Integer.parseInt(scanner.nextLine());

        double totalRating = 0;
        String bestFilm = "";
        String worstFilm = "";
        double minRate = Double.MAX_VALUE;
        double maxRate = Double.MIN_VALUE;

        for (int i = 0; i < filmCount; i++) {
            String filmName = scanner.nextLine();
            double rating = Double.parseDouble(scanner.nextLine());
            totalRating += rating;
            if (rating > maxRate) {
                maxRate = rating;
                bestFilm = filmName;
            } else if (rating<minRate ){
                minRate = rating;
                worstFilm = filmName;
            }


        }
        System.out.printf("%s is with highest rating: %.1f%n", bestFilm, maxRate);
        System.out.printf("%s is with lowest rating: %.1f%n", worstFilm, minRate);
        System.out.printf("Average rating: %.1f%n", totalRating / filmCount);

    }
}

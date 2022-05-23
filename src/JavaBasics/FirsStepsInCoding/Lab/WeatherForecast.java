package JavaBasics.FirsStepsInCoding.Lab;

import java.util.Scanner;

public class WeatherForecast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String wheather = scanner.nextLine();

        if (wheather.equals("sunny") ) {
            System.out.println("It's warm outside!");
        } else {
            System.out.println("It's cold outside!");
        }
    }
}

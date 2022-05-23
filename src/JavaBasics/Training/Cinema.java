package JavaBasics.Training;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int cinemaCapacity = Integer.parseInt(scanner.nextLine());
        int leftseats = cinemaCapacity;
        int peoples = 0;
        int sum = 0;
        int discount = 0;
        boolean isFull = false;
        int peoplesCount = 0;
        String input = scanner.nextLine();

        while (!input.equals("Movie time!")) {
            peoples = Integer.parseInt(input);
            if (leftseats < peoples) {
                isFull = true;
                break;

            }

            leftseats -= peoples;

            if (peoples % 3 == 0) {
                discount = 5;
            }
            sum += peoples * 5 - discount;
            discount = 0;

            peoplesCount += peoples;


            input = scanner.nextLine();
        }
        if (isFull) {
            System.out.println("The cinema is full.");

        } else {
            System.out.printf("There are %d seats left in the cinema.%n", cinemaCapacity - peoplesCount);


        }
        System.out.printf("Cinema income - %d lv.", sum);

    }
}

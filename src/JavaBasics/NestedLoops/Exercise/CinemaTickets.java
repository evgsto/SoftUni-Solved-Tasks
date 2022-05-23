package JavaBasics.NestedLoops.Exercise;

import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String ticketType = "";
        String name = scanner.nextLine();
        double studentTicket = 0;
        double standardTicket = 0;
        double kidTicket = 0;
        double ticket = 0;
        int totalTicket = 0;

        boolean endSale = false;

        while (!name.equals("Finish")) {
            int seats = Integer.parseInt(scanner.nextLine());

            ticketType = scanner.nextLine();

            while (!ticketType.equals("End")) {

                switch (ticketType) {
                    case "student":
                        studentTicket++;
                        totalTicket++;
                        ticket++;
                        break;
                    case "standard":
                        standardTicket++;
                        totalTicket++;
                        ticket++;
                        break;

                    case "kid":
                        kidTicket++;
                        totalTicket++;
                        ticket++;
                        break;
                }

                if (ticket == seats) {

                    break;
                }
                ticketType = scanner.nextLine();

            }

            System.out.printf("%s - %.2f%% full.%n", name, (ticket / seats) * 100);

            ticket = 0;

            name = scanner.nextLine();
        }

        System.out.println("Total tickets: " + totalTicket);
        System.out.printf("%.2f%% student tickets.%n", (studentTicket / totalTicket) * 100);
        System.out.printf("%.2f%% standard tickets.%n", (standardTicket / totalTicket) * 100);
        System.out.printf("%.2f%% kids tickets.%n", (kidTicket / totalTicket) * 100);

    }
}

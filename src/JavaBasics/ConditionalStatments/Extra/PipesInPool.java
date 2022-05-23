package JavaBasics.ConditionalStatments.Extra;

import java.util.Scanner;

public class PipesInPool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int volume = Integer.parseInt(scanner.nextLine());
        int pipe1 = Integer.parseInt(scanner.nextLine());
        int pipe2 = Integer.parseInt(scanner.nextLine());
        double hour = Double.parseDouble(scanner.nextLine());

        double filing = pipe1 * hour + pipe2 * hour;

        if (filing <= volume) {
            double volPipe1 = pipe1 * hour;
            volPipe1 = (volPipe1 * 100) / filing;
            double volPipe2 = pipe2 * hour;
            volPipe2 = (volPipe2 * 100) / filing;
            filing = (filing * 100) / volume;
            System.out.printf("The pool is %.2f%% full. Pipe 1: %.2f%%. Pipe 2: %.2f%%.", filing, volPipe1, volPipe2);
        } else {
            System.out.printf("For %.2f hours the pool overflows with %.2f liters.", hour, filing - volume);

        }

    }


}


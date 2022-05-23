import java.util.Scanner;

public class KaloqtMath {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int total = 0;
        String stop = "";
        while (!stop.equals("stop")) {
            for (int i = 0; i < 10; i++) {
                int num = Integer.parseInt(scanner.nextLine());
                total += num;
            }

            System.out.println("РЕЗУЛТАТ: "+ total);
            System.out.println("ЗАПОЧВА НА НОВО :");
            System.out.println("Press ENTER");
            total = 0;
            stop = scanner.nextLine();
        }

    }
}

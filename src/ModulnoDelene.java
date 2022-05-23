import java.util.Scanner;

public class ModulnoDelene {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Число за модулно деление:");
        String input = scanner.nextLine();


        while (!input.equals("stop")) {
            int n = Integer.parseInt(input);
            System.out.println("Модулен делител :");
            int modular = Integer.parseInt(scanner.nextLine());

            int result = n%modular;


            System.out.println("Число за модулно деление:");
            System.out.println("Ресултат :"+result);



            System.out.println("Число за модулно деление:");
            input = scanner.nextLine();
        }





    }
}
